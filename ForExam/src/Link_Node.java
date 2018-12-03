
public class Link_Node<T> {
	Link_Node<T> previous;
	T value;
	public Link_Node(T value) {
		// TODO Auto-generated constructor stub
		this.value = value;
	}
		public Link_Node<T> getPrevious() {
			return  previous;
		}
		public void setPrevious(Link_Node<T>previous) {
			this.previous = previous;
		}
		public T getValue() {
			return this.value;
		}
		public void setValue(T value) {
			this.value = value;
		}
		
}
