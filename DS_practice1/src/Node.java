import javax.lang.model.element.Element;

public class Node {
		private Node next;
		private Object element;
	public Node() {
		this(null,null);
	}
	public Node(Object o,Node n) {
		// TODO Auto-generated constructor stub
			element = o;
			next = n;
	}
	public Object getNode() {
		return element;
	}
	public Node getNext() {
		return next;
	}
	public Node newNode(Node newn) {
		next = newn;
		return next;
	}
}
