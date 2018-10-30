package try_catch_practice;

import java.util.Stack;

public class ㄔsta {
	public static void main(String[]args) {
			Stack<String> liStack = new Stack<>();
			liStack.add("dddd");
			liStack.add("aaa");
			liStack.add("dddd");
			System.out.println(liStack);
			for(int i =0;i<liStack.size();i++) {
				if(liStack.contains("dddd")) {
					liStack.remove(i);
				}
			}
	System.out.println(liStack);
	}
}
