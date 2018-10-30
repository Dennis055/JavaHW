import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.security.PrivilegedActionException;
import java.util.Stack;

import javax.swing.text.TabableView;

public class HtmlMatcher {
	private String urlStr;
	private String content;
	
	public HtmlMatcher(String url) {
		// TODO Auto-generated constructor stub
		this.urlStr = url;
	}
	
	private String fetchContent() throws IOException{
		URL url = new URL(this.urlStr);
		URLConnection conn = url.openConnection();
		InputStream in = conn.getInputStream();
		BufferedReader bReader = new BufferedReader(new InputStreamReader(in));
		
		String retVal = "";
		String line = null;
		
		while((line = bReader.readLine())!=null) { //while loop continue
			retVal = retVal + line + "\n";  
		}
		return retVal;
	}
	
	public void match() throws IOException {
		if(content==null) {
			content = fetchContent();//如果沒東西，就爬取
			//content = content.replaceAll("<meta","");
		}
		//使用string 的Stack來處理資料 
		Stack<String>tagStack = new Stack<>();
		 //內容的第一個物件
		int indexOfopen = 0; 
		//返回从 fromIndex（indexOfopen） 位置开始查找指定字符在字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1
		//因此，當有的時候，執行while，即將content的<>當作一組組要尋找的對象
		while((indexOfopen = content.indexOf("<",indexOfopen)) != -1) {
			int indexOfClose = content.indexOf(">", indexOfopen);
			//擷取「<XXX」當作一組物件為fullTag
			String fullTag = content.substring(indexOfopen, indexOfClose+1);
			//初始化tagName = " "
			String tagName = null;
			
			//接下來處理單元標籤以及一般標籤，好比<meta  ~~~~ />，不同於<head></head>
			int indexOfSpace = -1;
			//如果都沒有空白（一般標籤），則tagName =  ~ 去掉頭，先前的 <XXX 變成 XXX，也就是1 && length
			if((indexOfSpace = fullTag.indexOf(" ")) == -1) {
				tagName = fullTag.substring(1,fullTag.length()-1);
				//有空白的話（單元標籤），從文字開始到空白地方，比如<meta  ~~/ 擷取meta，然後為了後續處理加上0
			}else {
				tagName = fullTag.substring(1,indexOfSpace);//get tag name from index 1 to index of space
			}
			
			if(!tagName.contains("?") && tagName.contains("!") != true && !tagName.substring(tagName.length()-1).equals("/")) {
			//處理結尾字符（html為<c> </c>），如果沒有結尾字符，加入stack
			//此時的物件是 XXX or ""
			int indexOfSlash = -1;
			if((indexOfSlash = tagName.indexOf("/")) == -1) {
				tagStack.push(tagName);
			}else {
				/*
				 * 如果有，提出來該string
					substring:返回一个新的字符串，它是此字符串的一个子字符串。该子字符串始于指定索引处的字符，一直到此字符串末尾(不包括)。
					不要「/」，好比說</head>，只要head -> index of slash + 1:開始一直到結尾（因為sub不包括最後，直接用length）
					操作完，不論單元或者一般，tagName均為<>內標題。
				 */
				tagName  = tagName.substring(indexOfSlash +1, tagName.length());
				//檢查stack目前的情況
				if(tagStack.isEmpty()) {
					System.out.println("False");
					return;
				}
				//因為在else的判斷中，故在字串有/的前提下檢查是否跟stack中的push有重疊
				String topMostTag = tagStack.peek();//peek means top
				if(topMostTag.equals(tagName)) {
					tagStack.pop();//match -> get
				}else {
					//
					System.out.println("False" + getStackString(tagStack));
					return;
				}
			}//The end of else
			int indexFormeta = -1;
			if((indexFormeta = tagName.indexOf("meta"))!= -1 || (indexFormeta=tagName.indexOf("!"))!=-1) {
				tagStack.remove(tagName);
			}
		}
			//處理下一個stack，因此改變open
			indexOfopen = indexOfClose;
			
		}//while的終點
		if(!tagStack.isEmpty()) {
			//還沒清完，就print錯誤以及剩下的tag
			System.out.println("False" + getStackString(tagStack));
		}else {
			System.out.println("True");//全部空的 = 剛好都match
		}
	}	
	//結束match method
	
	/*
	 * 撰寫取出stack所存的tag內容，以用來表示stack中還有什麼物件。
	 */
	private String getStackString(Stack<String>tagStack) {
		StringBuilder  sBuilder = new StringBuilder();
		for(int i =0;i<tagStack.size();i++) {
			if(i>0) {
				sBuilder.append(" ");
			}
			sBuilder.append(tagStack.get(i));
		}
		return sBuilder.toString();
	}
}
// 想辦法處理網頁tag
	


		 
	

