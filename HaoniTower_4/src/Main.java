
import java.util.Scanner;
public class Main {

	 public static void main(String[] args){

	  
	  System.out.print("輸入盤數:");
	  Scanner sc = new Scanner(System.in);
	  int numOfDisks = sc.nextInt();
	  Hanoi hanoi = new Hanoi(numOfDisks);
	  hanoi.start();
	 }
	}

