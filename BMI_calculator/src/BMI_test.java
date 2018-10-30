import java.util.Scanner;

public class BMI_test {
		public void main(String[] args) {
			Scanner scanner1 = new Scanner(System.in);
			int gap =1;
			BMI_calculator bmi_calculator = new BMI_calculator();
			double weight = scanner1.nextDouble();
			double height = scanner1.nextDouble();
			bmi_calculator.Calculate_BMI(height , weight);
		}
}
