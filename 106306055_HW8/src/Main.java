import java.util.Scanner;

import javax.lang.model.element.VariableElement;

public class Main {
		public static void main(String[]args) {
			KeywordList list = new KeywordList();
			Scanner scanner = new Scanner(System.in);
			while(scanner.hasNextLine()) {
				String op = scanner.next();
				
				switch (op) {
				case "add":
					String name = scanner.next();
					int count = scanner.nextInt();
					list.add(new Keyword(name, count));
					break;
					case "sort":
						list.sort();
						break;
					case "output":
						list.output();
						break;
				default:
					System.out.println("Invalid Operation");
					break;
				}
 			}
			scanner.close();
		}
}
