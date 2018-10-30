package old_nine;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.omg.CORBA.PUBLIC_MEMBER;

public class noCheckerror {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("Desktop/ppt.txt");
		System.out.println(file.exists());
		try {
			FileWriter fileWriter = new FileWriter(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
	}

}
