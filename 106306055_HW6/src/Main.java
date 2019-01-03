import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			WebPage rootPage = new WebPage("http://soslab.nccu.edu.tw/Welcome.html", "Welcome");
			WebTree tree = new WebTree(rootPage);
			
			tree.root.addChild(new WebNode(new WebPage("http://soslab.nccu.edu.tw/Welcome.html", "Project")));
			tree.root.addChild(new WebNode(new WebPage("http://soslab.nccu.edu.tw/Publications.html", "Publication")));
			tree.root.children.get(1).addChild(new WebNode(
					new WebPage("https://scholar.google.com/citations?user=IpxUy-YAAAAJ&hl=en", "Google ")));
			tree.root.children.get(1).addChild(new WebNode(
					new WebPage("https://dblp.uni-trier.de/pers/hd/y/Yu:Fang.html", "DBLP")));
			tree.root.addChild(new WebNode(new WebPage("http://soslab.nccu.edu.tw/Members.html", "Member")));
			tree.root.addChild(new WebNode(new WebPage("http://soslab.nccu.edu.tw/Courses.html", "Courses")));
			
			Scanner sc = new Scanner(System.in);
			while(sc.hasNextLine()) {
				int NumOfKeywords = sc.nextInt();
				ArrayList<Keyword>keywords = new ArrayList<>();
				
				for(int i=0;i<NumOfKeywords;i++) {
					String name = sc.next();
					double weight = sc.nextDouble();
					Keyword k = new Keyword(name, weight);
					keywords.add(k);
				}
				tree.setPostOrderScore(keywords);
				tree.printTree();
			}
	}
}
