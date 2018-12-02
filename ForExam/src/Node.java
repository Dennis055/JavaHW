
public class Node {
	Object ele;
	Node left;
	Node right;
	
		public Node(Object root) {
			// TODO Auto-generated constructor stub
			this(root , null,null);
			
		}
		public Node(Object root ,Node left , Node right ) {
			this.ele = root;
			this.left = left;
			this.right = right;
		}
		public Node() {
			this(null);
		}
		static int size(Node cur) {
			if(cur==null)
				return 0;
			else
				return 1 + size(cur.left) + size(cur.right);
		}
		static int height(Node cur) {
			if(cur==null)
				return -1;
			else
				return 1 + Math.max(height(cur.left), height(cur.right));
		}
		void visit() {
			System.out.println(this.ele);
		}
		void printPreOrder() {
			visit();
			if(this.left!=null)
				printPreOrder();
			if(this.right!=null)
				printPreOrder();
		}
		void printInOrder() {
			
			if(this.left!=null)
				printPreOrder();
			visit();
			if(this.right!=null)
				printPreOrder();
		}
		void printPostOrder() {
			if(this.left!=null)
				printPreOrder();
			if(this.right!=null)
				printPreOrder();
			visit();
		}
}
