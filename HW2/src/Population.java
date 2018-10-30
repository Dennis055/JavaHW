import java.util.Scanner;

public class Population {
		public static void main(String[]args) {
		System.out.println("Please enter population and years");
		Scanner scanner = new Scanner(System.in);
		long population = scanner.nextLong();
		long years = scanner.nextLong();
		long true_year = years/30;
		GeomProgression geo = new GeomProgression(population,2);
		geo.printProgression((int) true_year);
			}
}
