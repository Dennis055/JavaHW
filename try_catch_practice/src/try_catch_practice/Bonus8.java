package try_catch_practice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.print.attribute.standard.Sides;

public class Bonus8 {
		private static ArrayList<ArrayList<Integer>> totalStudents = new ArrayList<>();
		public static  void main(String[]args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("請輸入有幾位同學");
			while(scanner.hasNextLine()) {
	
			System.out.println("請輸入小考次數");
			int students = scanner.nextInt();
			int quiz_times = scanner.nextInt();
			statStudent(students, quiz_times);
			showResult(totalStudents);
			break;
			}
			scanner.close();
		}
		
		
		public static void statStudent(int students , int quiz_times) {
			for(int i =1;i<students+1;i++) {
				ArrayList<Integer>gradelist = new ArrayList<>();
				for(int j =1;j<quiz_times+1;j++) {
				System.out.println("請輸入第" + i + "位同學第" +j +"次小考成績。");
				Scanner scanner = new Scanner(System.in);
				int each_grade = scanner.nextInt();
				gradelist.add(each_grade);
				}
				totalStudents.add(gradelist);
			}
		}
		public static double calculateNeeded(ArrayList<Integer>gradelist) {
			int sum =0;
			for(int i =0;i<gradelist.size();i++) {
				int grade = gradelist.get(i);
				sum += grade;
			}
			double average = sum / gradelist.size();
			return average;
		}
		public static void showResult(ArrayList<ArrayList<Integer>>total) {
			for(int i =1;i<total.size() + 1;i++) {
				String grade = "";
				ArrayList<Integer> gradelist = total.get(i-1);
				for(int j = 0;j<gradelist.size();j++) {
				grade += gradelist.get(j) +  " "; //collect grade
				}
				String message = "第"+i+"位  " +grade + "AVG=" + calculateNeeded(gradelist);
				System.out.println(message);
			}
		}
}
