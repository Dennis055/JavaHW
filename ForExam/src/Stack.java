
public abstract class Stack<E> {
	protected int counts;//記載element數量
	abstract public void push(E value);
	abstract public E pop();
	abstract public E peek();
	public int size() {
		return counts;
	}
	
}
