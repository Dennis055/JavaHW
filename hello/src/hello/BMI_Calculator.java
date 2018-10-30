package hello;

import java.security.PublicKey;
import java.util.Scanner;

public class BMI_Calculator {
	public double Calculate_BMI(double height,double weight) {
		weight = weight;
		height = height/100;
		double BMI =  (weight/(Math.pow(height,2)));
		judge_result(BMI);
		return  BMI;
	}

	
	public void judge_result(double BMI) {
		if (BMI>=30){
			System.out.println("You are not in shape. Actually, you are not even close.");
		}else if(30>BMI && BMI>=26) {
			System.out.println("To be honest, you are not in shape.");
		}else if(26 >BMI && BMI >= 20) {
			System.out.println("You are in shape");
		}else {
			System.out.println("You are under shape");
		}
	}
	public void main(String[]args) {
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		int gap =1;
	
			
			double weight = scanner1.nextDouble();
			double height = scanner2.nextDouble();
			Calculate_BMI(height, weight);
		
		
	}
	
}
