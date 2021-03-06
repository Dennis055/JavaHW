package subFinder;
import java.awt.Window;
import java.awt.Window.Type;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.annotation.Retention;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.InputMismatchException;

import javax.swing.text.AbstractDocument.Content;

public class wordCounter {
	private String url;
	private String cotent;
	
	public wordCounter(String url) {
		// TODO Auto-generated constructor stub
		this.url = url;
	}
	private String fetchContent() throws IOException{
		String retVal = "";
		try {
		//TODO 如何處理沒有https的網頁？以免出現 java.net.MalformedURLException:
		if(this.url.contains("BBC")==true) {
			this.url = "https://www.google.com"; //
		}
		if(this.url.contains("http")!=true) {
			this.url  = "http://" + url;
		}
		URL url = new URL(this.url);
		URLConnection conn = url.openConnection();
		InputStream in = conn.getInputStream();	
		BufferedReader bReader = new BufferedReader(new InputStreamReader(in));
		
		
		//String retVal = "";
		String line = null;
		
		while((line = bReader.readLine())!=null) { //while loop continue
			retVal = retVal + line + "\n";  
		}
		return retVal;
		}catch (Exception e) {
			// TODO: handle exception
			return retVal;
		}
	}
	
	public  int countKeyword(String keyword) throws IOException {
		if(cotent==null) {
			cotent = fetchContent();
		} // To count the times of content after this method
		
		cotent = cotent.toUpperCase();
		keyword = keyword.toUpperCase();
		// Transforming the word to upper case for catch the key word 
		
		// TO DO:indexOf(keyword)
		int count = 0;	
		while(cotent.indexOf(keyword)!=-1) {
		int cur = cotent.indexOf(keyword);
		cotent = cotent.substring(cotent.indexOf(keyword) + keyword.length(),cotent.length());
		count++;
			}	
		// brute-force algorithm :time complexcity: O(mn) -> while exhits the m time of P.length()
		// n shows that the occurence occures n time (n.length = n)
		return count ;
	}
	

}


