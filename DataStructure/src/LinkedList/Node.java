package LinkedList;

public class Node {
		private Object ele;
		private Node next;
		private int position;
		public Node(Object ele , Node next) {
			// TODO Auto-generated constructor stub
			this.ele = ele;
			this.next = next;
		}
		public Object getEle() {
			return this.ele;
		}
		public Node getNext() {
			return this.next;
		}
		
		public void setEle(Object new_ele) {
			this.ele = new_ele;
		}
		public void setNext(Node new_next) {
			this.next = new_next;
		}
		public void setPosition(int place){
			this.position = place;
		}
		public int getPosition() {
			return this.position;
		}
}	
