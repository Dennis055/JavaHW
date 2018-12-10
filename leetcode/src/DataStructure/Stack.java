package DataStructure;

import java.util.ArrayList;

public class Stack<T>{
	ArrayList<T>stack = new ArrayList<>();
	public int size() {
		return stack.size();
	}
	public T pop() {
		int last = stack.size()-1;
		T bye = stack.get(last);
		stack.remove(last);
		return bye;
	}
	public void push(T obj) {
		stack.add(obj);
	}
	public T getTop() {
		int last = stack.size()-1;
		T bye = stack.get(last);
		return bye;
	}
}
