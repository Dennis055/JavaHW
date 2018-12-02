
public class BinaryTree {
	private Node root;
	/*
	 * To store data in first binary tree
	 */
	public BinaryTree(Object TreeRootData) {
		// TODO Auto-generated constructor stub
		this.root = new Node(TreeRootData);
	}
	public BinaryTree() { // Construct empty binary tree
		this(null);
	}
	 
	public void printInOrder() {
		if(this.root!=null)
			root.printInOrder();
	}
	public void printPostOrder() {
		if(this.root!=null)
			root.printPostOrder();
	}
	public void printPreOrder() {
		if(this.root!=null)
			root.printPreOrder();
	}
	public void makeEmpty() {
		root = null;
	}
	public boolean isEmpty() {
		return root==null;
	}
	public int size() {
		return Node.size(root);
	}
	public int height() {
		return Node.height(root);
	}
}
