import java.util.ArrayList;
import java.util.Stack;

import javax.swing.text.StyledEditorKit.ForegroundAction;
import javax.xml.soap.SAAJResult;

import org.w3c.dom.css.ElementCSSInlineStyle;

public class stackkk {
	static Stack<Integer>from = new Stack<>();
	static Stack<Integer>by = new Stack<>();
	static Stack<Integer>to = new Stack<>();
	
	public void moveFirst(Stack<Integer>from,Stack<Integer>to,char a, char b) {
		int execTime = from.size();
		for(int i=0; i<execTime-1 ;i++) {
		System.out.println("Take disk " + from.peek() +" from " + a + "  to  " + b );
		int bye = from.pop();
		to.push(bye);
		}
	}
	
	public void moveSecond(Stack<Integer>from , Stack<Integer>to , char a , char c) {
		System.out.println("Take the last one " + from.peek() + " from " + a + " to " + c );
		int retain = from.pop();
		by.push(retain);
	}
	
	public void moveThird(Stack<Integer>by, Stack<Integer> to ,char a, char c ) {
		int execTime = by.size();
		for(int i=0;i<execTime;i++) {
		System.out.println("Take the disk " + by.peek() + " from "  + a + " to " + c);
		int go = by.pop();
		to.push(go);
		}
	}

	public static void main(String[] args) {	
		ArrayList<Integer> ele = new ArrayList<>();
		for(int i = 0;i<6;i++) {
		ele.add(i);	
		}
		for(int i =0;i<ele.size();i++) {
			from.push(i);
			System.out.print(from.peek() + " ");
		}
		System.out.print("\n");
		/**
		 * 從第一個stack 移出 n-1 個 element
		 * from to by
		 */
		char a= 'a';
		char b = 'b';
		char c = 'c';
		stackkk haoni = new stackkk();
		haoni.moveFirst(from, by, a, b);
		haoni.moveSecond(from, to, a, c);
		haoni.moveThird(by, to, b, c);
		
	}
}
	