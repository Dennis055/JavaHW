
public class LinkedList<T> {
	T element;
	T next;
		public LinkedList(T ele , T next) {
			// TODO Auto-generated constructor stub
			this.element = ele;
			this.next = next;
			
		}
		public T getElement() {
			return this.element;
		}
		public T getNext() {
			return this.next;
		}
		
		public void setElement(T setting) {
			this.element = setting;
		}
		public void setNext(T next) {
			this.next = next;
		}
	
}
