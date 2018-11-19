import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

public class haoni {
	String by,from,to;
	private void move(int plate,String from , String by , String to) {
		if(plate==1) {
			System.out.println("plate move from    " + from + "   to    " + to);
		}else {
		move(plate -1, from, to, by);
		move(1, from, by, to);
		move( plate-1, by, from, to);
		}
	}
	public static void main(String[]args) {
		System.out.println("Please enter the number of plates");
		Scanner s  = new Scanner(System.in);
		int plate = s.nextInt();
		haoni haoni = new haoni();
		haoni.move(plate, "A塔", "B塔", "C塔");
		
	}
}
