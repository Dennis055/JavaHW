package old_nine;

import java.util.logging.Logger;

import javax.naming.spi.DirStateFactory.Result;

public class errorCathcDemo {
			
		public 	static int divide(int x,int y) {
			int result = Integer.MIN_VALUE; 
			try {
			result =  x/y;
			}catch (Exception e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
			return result;		
		}
			public static void main(String[]args) {
				divide(5, 0);
			}
}
