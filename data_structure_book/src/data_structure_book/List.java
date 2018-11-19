package data_structure_book;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class List {
		Node head;
		Node tail;
		public List() {
			// TODO Auto-generated constructor stub
			this.head = null;
		}
		/*
		 * 思路：cursor 與 上一個的cursor一起移動
		 */
		public void insert(int data) {
			Node new_node, cursor,he;
			new_node = new Node(data);
			cursor = he = head;
			while(cursor!=null && cursor.data<data) {
				he=cursor;
				cursor  = cursor.next;
			}
			new_node.next = cursor;
			if(cursor==head) {
				head = new_node;
			}
			else
				he.next = new_node;
		}
		public void remove(int data) {
			Node cursor,temp;
			cursor = head ;
			temp = null;
			while(cursor!=null&&cursor.data!=data) {
				temp = cursor;
				cursor = cursor.next;
			}
			if(cursor!=null) {
				if(cursor==head) {
					head = cursor.next;
				}else {
					temp.next = cursor.next;
				}
			}
		}
		
		public void Stackpush(int data) {
			Node n_node ;
			n_node = new Node(data);
			if(head==null) {
				head = n_node;
			}else {
				tail.next = n_node;
				n_node = tail;
			}
		}
		
}
