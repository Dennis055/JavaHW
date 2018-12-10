package LinkedList;

import java.util.function.IntPredicate;

public class MyLinkedList {
		Node head;
		int[]series;
		int place = 0;
	public void addFirst(Object value) {
		if(head==null) {
			Node first = new Node(value, null);
			head = first;
		}
		Node node = new Node(value, head);
		head = node;
		head.setPosition(place);
		place++;
	}
	public void addLast() {
	}
	public int getSize() {
		return place + 1;
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
	public void addBefore(int value , int place) {
		
	}
	public void addAfter(int value , int place) {
		
	}
	
	public boolean isEmpty() {
		return place==0;
	}
	
	
	public static void main(String[]args) {
		MyLinkedList list = new MyLinkedList();
	}

}
