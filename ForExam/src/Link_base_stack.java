
public class Link_base_stack<T>extends Stack<T> {
	private Link_Node<T>last;
	
	@Override
	public void push(T value) {
		// TODO Auto-generated method stub
		Link_Node<T>node = new Link_Node<T>(value);
		node.setPrevious(last);
		last = node;
		counts++;
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		Link_Node<T>node = this.last;
		last = last.getPrevious();
		node.setPrevious(null);
		--counts;
		return node.getValue();
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return last.getValue();
	}
	
}
