import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;
import javax.swing.text.StyledEditorKit.ForegroundAction;
import javax.xml.bind.ParseConversionEvent;

public class Problem7 {
			/*
			 * 跟第一題很像，說明就用第一題的
			 * a.INALFSZUQ
			 * 
			 * b.AFILNQSUZ
			 * 
			 * 證明：
			 * 程式碼實作，首先觀察他是一顆不完整二元樹，我的話習慣用array來做tree
			 * 那用array的話，就會當作他是一顆完整二元樹，所以size = 12
			 */
			static String []tree = {null,"Q","F","U","A","L","S","Z",null,null,"I","N"};
//			
//			static void visit(int index) {
//				System.out.print(tree[index] + " ");
//			}
//			public static int getParent(int index) {
//				int parent;
//				if(index%2==0)
//					parent =index/2;
//				else
//					 parent = (index-1)/2;
//				return parent;
//			}
//			public static int getChildren(int index) {
//				int  children;
//				if(index%2==0)
//					children = index*2;
//				else
//					children = index*2+1;
//				return children;
//			}
//			
//			
//			static void Inorder(int root) {
//				 int new_root = getChildren(root);
//				 Inorder(new_root);
//			}
//			public static void main(String[]args) {
//				System.out.println(tree[1]);
//			}
//			
//
//				



}
