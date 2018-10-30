import java.util.Scanner;

public class capital {
		public static void main(String[]args) {
			System.out.println("Plaese enter capital and base");
			Scanner scanner = new Scanner(System.in);
			double capital = scanner.nextDouble();
			double year = scanner.nextDouble();
			double rate = 1.024;
			GeomProgression<Double>geomProgression = new GeomProgression<Double>(capital, rate);
			geomProgression.printProgression((int)year);
		}
}
