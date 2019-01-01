import java.util.Scanner;

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
			case "find":
				String s= scanner.next();
				list.find(s);
				break;
				
			default:
				System.out.println("Invalid Operation");
				break;
			}
		}
		scanner.close();
	}
}
