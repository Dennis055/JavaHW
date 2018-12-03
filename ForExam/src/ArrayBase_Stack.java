import java.nio.channels.NetworkChannel;
import java.util.EmptyStackException;
import java.util.concurrent.BlockingDeque;

public class ArrayBase_Stack{
	private int capacity;
	private int [] mystack;
	int top;
	
	public ArrayBase_Stack(int size) {
		// TODO Auto-generated constructor stub
		this.capacity = size;
		mystack = new int[capacity];
	}
	
	void DoubleStack() {
		capacity *=2;
		int[]new_stack = new int[capacity];
		for(int i =0;i<capacity/2;i++) {
			new_stack[i] = mystack[i];
		}
		mystack = new_stack;
	}
	

	public void push(int value) {
		// TODO Auto-generated method stub
		if(top==capacity-1) {
			DoubleStack();
		}
		mystack[++top] = value;
	}


	public  int pop() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Invalid operand");
		}
		int bye = mystack[top];
		top--;
		return bye;
	}
	boolean isEmpty() {
		return mystack.length==0;
	}


	public int peek() {
		// TODO Auto-generated method stub
		return this.top;
	}
	
	
}
