import java.util.ArrayList;
import java.util.Scanner;
import java.awt.DisplayMode;
import java.util.*;
import java.util.Stack;

import javax.xml.ws.Dispatch;

public class RealHaoni {
	
	public static int numOfPlate;
	/**
	 * 創建一個interger stack的陣列，長度為四。（為了可以使用1、2、3三個數字
	 * ）
	 */
	public static Stack<Integer>[] tower = new Stack[4]; 

	
	public static void main(String []args) {
		tower[1] = new Stack<Integer>();
		tower[2] = (new Stack<Integer>());
		tower[3] = (new Stack<Integer>());
	
		System.out.println("Enter number of disks");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		numOfPlate = num;
		toh(num);
	}
	/*
	 * 配合recursive.把盤子從一放到二，再從二放回一
	 */
	public static void move(int n,int from , int by , int to) {
		if(n > 0) {
			move(n-1, from, to, by);
			//Stack<Integer> First = tower.get(from);
			int bye = tower[from].pop();			
			//Stack<Integer> Second = tower.get(to);
			tower[to].push(bye);
			display();
			move(n-1, by, from, to);
		}
	}
	public static void move1(int n,int from , int by ,int to) {
		if(n>0) {
			move(n-1, from, to, by);
			int bye = tower[from].pop();
			tower[to].push(bye);
			display();
			move(n-1, by, from, to);
		}
	}
	/*
	 * 實際上就是執行 main method 要做的事情。
	 */
	
	public static void toh(int num) {
		for(int num_plate = num;num_plate>0;num_plate--) {
			tower[1].push(num_plate);
			}
			display();
			move(num, 1, 2, 3);
	}
	
	public static void display() {
		System.out.println(" A | B | C ");
		System.out.println("------------");
		for(int i = numOfPlate-1 ;i>=0 ;i--) {
			String d1 =" ";
			String d2 =" ";
			String d3 =" ";
			try {
				d1 = String.valueOf(tower[1].get(i));
			}catch (Exception e) {
				// TODO: handle exception
			}
			try {
				d2 = String.valueOf(tower[2].get(i));
			}catch (Exception e) {
				// TODO: handle exception
			}
			try {
				d3 = String.valueOf(tower[3].get(i));
			}catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(" " + d1 + " |  " + d2 + "  |  " + d3);		
		}
		System.out.println("\n");
	}
}
