package try_catch_practice;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Average {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		double sum = 0;
		int count = 0;
		boolean gate = true;
		try {
		while(gate) {
			double number = scanner.nextDouble();
			if(number == 0) {
				break;
			}
			sum += number;
			count++;
		}
		double average = sum/count;
		System.out.println(average);
	}catch (InputMismatchException e) {
		// TODO: handle exception
		System.out.println("Please enter the Integer");
		System.out.printf("Try pass the non-integer input%s%n", scanner.next());
		}
	System.out.printf("average   %.2f%n",sum/count);	
	}
}
