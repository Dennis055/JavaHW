package LinkedList;

import java.util.function.IntPredicate;

public class MyLinkedList {
		Node head;
	public void insert(Object value) {
		if(head==null) {
			Node first = new Node(value, null);
			head = first;
		}
		Node node = new Node(value, head);
		head = node;
	}
	public Node remove() {
		if(head==null)
			System.out.println("Invalid Operand");
		
		Node new_head  = head.getNext();
		Node bye = head;
		head.setNext(null);
		this.head = new_head;
		return bye;
	}
	public static void main(String[]args) {
		MyLinkedList list = new MyLinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		for(int i = 0;i<3;i++) {
			System.out.print(list.head);
		}
	}

}
