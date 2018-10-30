package try_catch_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UtilFile {
	public static String readFile(String name) {//read the txt file
		StringBuilder stringBuilder = new StringBuilder();
		try {
			Scanner scanner = new Scanner(new FileInputStream(name));
			while(scanner.hasNext()) {
				stringBuilder.append(scanner.nextLine());
				stringBuilder.append("\n");
			}
		}catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return stringBuilder.toString();	
	}
}
