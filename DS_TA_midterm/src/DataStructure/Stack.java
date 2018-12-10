package DataStructure;

import javax.print.attribute.Size2DSyntax;

public class Stack <T>{
		T[]base;
		int size = base.length;
		public void push(T ele) {
			if(size==0) {
				base[0] = ele;
			}
			base[size-1] = ele;
		}
		public T pop() {
			T bye = base[size-1];
			base[size-1] = null;
			return bye; 
		}
	
		public T peek() {
			return this.base[size-1];
		}
		public int size() {
			return this.size();
		}
		public boolean isEmpty() {
			return this.size()==0;
		}
		public static void main(String[]atgs) {
			Stack<Integer>teStack = new Stack<>();
			teStack.push(1);
			System.out.println(teStack.isEmpty());
			teStack.push(2);
			System.out.println(teStack.peek());
		}
}




