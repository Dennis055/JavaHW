package switchDemo;

import java.util.Scanner;

public class cal_deci {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int temp = num;
		int sum = 0;
		while(temp>0) {
			sum += temp%10;
			temp = temp/10;
		}
		System.out.println(sum);
	}
}
