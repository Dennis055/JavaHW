

	import java.util.ArrayList;
	import java.util.Scanner;
	import java.awt.DisplayMode;
	import java.util.*;
	import java.util.Stack;
import java.util.function.IntBinaryOperator;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;
import javax.xml.ws.Dispatch;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Real {
	
	public static Stack<Integer> tower[] = new Stack[4];
	
	public static void move(int num,int a ,int b ,int c) {
		if(num>1) {
			move(num-1, a, b, c);
			int bye = tower[a].pop();
			tower[c].push(bye);
			display();
			move(num-1, b,a, c);
		}
	}
	public static void display() {
		
	}
	
	public static void main(String []args) {
		tower[1] = new Stack<Integer>();
		tower[2] = new Stack<Integer>();
		tower[3] = new Stack<Integer>();
	
	/*
	 * 到第三個盤子開始，由上一個動作重複 + 本身執行一次
	 * 上一個動作：move() -> recursive
	 * 
	 * 
	 */
	
	
	
	}
	
	
}