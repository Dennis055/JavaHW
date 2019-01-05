package subFinder;

import java.io.IOException;
import java.util.ArrayList;

public class UnitTest {
	public static void main(String[]args) throws IOException {
		String keyTest = "壽司";
		subFinder finder = new subFinder();
		GoogleQuery querier = new GoogleQuery(keyTest);
		ArrayList<String>rootlist = querier.queryForArr();
		ArrayList<String>titleList =querier.queryForTitle(); 
		//Setting for test
		int i = 0;
		Keyword keyword = new Keyword(keyTest, 1.1);
		ArrayList<Keyword>keywords = new ArrayList<Keyword>();
		keywords.add(keyword);
		//ArrayList<Double>scoreList = new ArrayList<Double>();
		double[]scoreList = new double[10];
		ArrayList<WebTree>forest = new ArrayList<WebTree>();//一個放所有tree的list
		//end
		for(String rooturl:rootlist) {
			
			WebPage rootPage = new WebPage(rooturl,titleList.get(i));
			i++;
			WebTree tree = new WebTree(rootPage);
			System.out.println(rooturl);
			ArrayList<String>children  = finder.findSublinks(rooturl);
			for(String child:children) {
				tree.root.addChild(new WebNode(new WebPage(child ,"")));
			}
			tree.setRootScore(keywords);
			tree.printRoot(tree.root);
			//forest.add(tree);
			//TODO 子網頁的分數累加到整個網頁  
			//tree.setPostOrderScore(keywords);
			//tree.printTree();

		//System.out.println(tree.root.nodeScore);
		}
		//上面括弧是最上層for迴圈結束
//		Gardener gardener = new Gardener(forest);
//		gardener.printResult();
	}
}