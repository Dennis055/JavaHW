import java.util.Scanner;

import javax.annotation.Generated;

public class Population {
	public static void main(String[]args) {
	Scanner scanner = new Scanner(System.in);
	String control = scanner.next();
	String ok = "o";
	String stop = "s";
	boolean gate =true;
	while(gate) {
	if(control=="o") {
	System.out.println("Please enter the population and years");	
	int population = scanner.nextInt() ;
	int n = scanner.nextInt();
	GeomProgression<Integer> geomProgression = new GeomProgression<Integer>(population,2);
	int true_n = n/30;
	System.out.println("Population grow");
	geomProgression.printProgression(true_n);
	}else {
	 	gate = false;
	  }
		}		
	}
}
