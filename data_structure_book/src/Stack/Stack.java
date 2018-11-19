package Stack;

public class Stack {
	/*
	 * 思路：只在意top是多少，利用top來移動即可
	 */
		int top;
		int self_stack[];
		int Maxsize;
		public Stack(int size) {
			// TODO Auto-generated constructor stub
			top = 0;
			self_stack = new int[size];
			Maxsize = size;
		}
		
		public void push(int data) {
			self_stack[top] = data;
			top++;
		}
		/*
		 * 假性pop
		 */
		public int pop() {
			top--;
			return self_stack[top];
		}
		public boolean isFull() {
			if(top==Maxsize) {
				return true;
			}else
				return false;
		}
		public boolean isEmpty() {
			if(top==0)
				return true;
			else
				return false;
			// or return top==0; ->clean code
		}
}
