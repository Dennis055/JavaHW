package hihi;

import java.awt.print.Printable;
import java.lang.reflect.Array;

import org.omg.CORBA.PUBLIC_MEMBER;

public class HW1_Tester {
	public static void main(String[] args) {
		// variable
		byte x0 = 0;
		int x1 = 0;
		double x2 = 0;
		long x3 = 0;
		short x4 = 0;
		float x5 = 0;
		byte x6 = 0;
		char x7 = '0';
		System.out.println("x1" + " = " + x1);
		System.out.println("x2" + " = " + x2);
		System.out.println("x3" + " = " + x3);
		System.out.println("x4" + " = " + x4);
		System.out.println("x5" + " = " + x5);
		System.out.println("x6" + " = " + x6);
		System.out.println("x7" + " = " + x7);
		x1 = x1 + 1;
		x2 = x2 + 1;
		x3 = x3 + 1;
		x4 = (short) (x4 + 1);
		x5 = x5 + 1;
		x6 = (byte) (x6 + 1);
		x7 = (char) (x7 + '1');
		System.out.println("After update the variable!");
		System.out.println("x1" + " = " + x1);
		System.out.println("x2" + " = " + x2);
		System.out.println("x3" + " = " + x3);
		System.out.println("x4" + " = " + x4);
		System.out.println("x5" + " = " + x5);
		System.out.println("x6" + " = " + x6);
		System.out.println("x7" + " = " + x7);
		
		// constant
		final int c1 = 0;
		final double c2 = 0;
		final long c3 = 0;
		final short c4 = 0;
		final float c5 = 0;
		final byte c6 = 0;
		final char c7 = '0';
		System.out.println("c1" + " = " + c1);
		System.out.println("c2" + " = " + c2);
		System.out.println("c3" + " = " + c3);
		System.out.println("c4" + " = " + c4);
		System.out.println("c5" + " = " + c5);
		System.out.println("c6" + " = " + c6);
		System.out.println("c7" + " = " + c7);

		/**
		 * Q1:eclipse throws the message: The final local variable __ cannot be
		 * assigned. It must be blank and not using a compound assignment
		 */

		// Q2 part
		int x = 10;
		int y = 3;
		x = x + 1;
		y++;
		System.out.println(x);
		System.out.println(y);
		// Q3 part
		float age1 = 18;
		float age2 = 35;
		float age3 = 50;
		float age4 = 44;
		double average = (age1 + age2 + age3 + age4) / 4;
		System.out.println(average);
		// Q4 part
		double probability = 8.70;
		int percentage = (int) (Math.round(100 * probability));
		System.out.println(percentage);
		
		//To show them for white white
		int x869 = 869;
		int x870 = 870;
		long x870d = 870;
		System.out.println(Integer.toBinaryString(percentage));
		System.out.println(Integer.toBinaryString(x869));
		System.out.println(Integer.toBinaryString(x870));
		System.out.println(Long.toBinaryString(x870d));
	
		/**
		 * 
		 * @author Dennis
		 * @param 
		 */
	
	}
}
