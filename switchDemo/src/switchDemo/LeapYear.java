package switchDemo;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[]args) {
		int year,month,dayCalculate = -1;
		System.out.println("please enter the year:");
		Scanner inp = new Scanner(System.in);
		year = inp.nextInt();
		System.out.println("please enter the month:");
		month = inp.nextInt();
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			dayCalculate = 31;
			break;
		case 2:
			dayCalculate = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			dayCalculate = 30;
			break;
		default:
			System.out.println("there is wrong!");
			System.exit(0);
		}
	boolean	isLeapYear = year%4==0 && year%100!= 0 ||year%400==0;
	if(isLeapYear) {
		dayCalculate++;
		}
	System.out.println(year + "年" + month +"月" + "有"+dayCalculate+ "天");
	}
}
