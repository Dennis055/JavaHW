import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		keywordHeap heap = new keywordHeap();
		
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextLine()) {
			String op = scanner.next();
			switch (op) {
			case "add":
				String name = scanner.next();
				int count = scanner.nextInt();
				double weight = scanner.nextDouble();
				heap.add(new Keyword(name, count, weight));
				break;
			case "peek":
				heap.peek();
				break;
			case "removeMin":
				heap.removeMin();
				break;
			case "output":
				heap.output();
				break;
			case "h":
				heap.outPut();
				break;
			default:
				System.out.println("InvalidOperationad");
				break;
			}
		}
	}
}
