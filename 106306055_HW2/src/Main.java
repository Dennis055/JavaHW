import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		System.out.println("Please type datatype,first,base,n");
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextLine()) {
			try {
				int type = scanner.nextInt();
			switch (type) {
			case 0:
				GeomProgression<Integer> intGeomProg = new GeomProgression<Integer>(scanner.nextInt(),scanner.nextInt());
				intGeomProg.printProgression(scanner.nextInt());
				break;
			case 1:
				GeomProgression<Float> floatGeomProg = new GeomProgression<Float>(scanner.nextFloat(),scanner.nextFloat());
				floatGeomProg.printProgression(scanner.nextInt());
			case 2:
				GeomProgression<Double>doubleGeomProg = new GeomProgression<Double>(scanner.nextDouble(), scanner.nextDouble());
				doubleGeomProg.printProgression(scanner.nextInt());
			default:
				System.out.println("InvalidType");
				scanner.nextLine();
				break;
			}
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("InvalidType");
				scanner.nextLine();
			}
		}scanner.close();
	}
}
