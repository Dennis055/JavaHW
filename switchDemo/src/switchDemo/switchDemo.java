package switchDemo;

import java.util.Scanner;

public class switchDemo {
		public static void main(String[]args) {
			
			System.out.println("enter 1 to start the game , 2 to exit the game");
			Scanner input = new Scanner(System.in);
			int  choice = -1;//To save the user choices
			choice = input.nextInt();
		
			if(choice == 1) {
				System.out.println("1,friends");
				System.out.println("2,explore");
				System.out.println("3,play ");
				System.out.println("4,jump to the island");
				choice = input.nextInt();
				switch (choice) {
				case 1:
					System.out.println("list");
					System.out.println("search");
					break;
				case 2:
					System.out.println("To explore");
				default:
					break;
				}
				
		}else if(choice ==2) {
			System.exit(0);//exit the Java application
		}else {
			System.out.println("wrong!");
		}
	}
}
