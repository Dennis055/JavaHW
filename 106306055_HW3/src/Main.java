import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			System.out.println("Please type:URL Keyword");
			Scanner scanner = new Scanner(System.in);
			while(scanner.hasNextLine()) {
				String url = scanner.next();
				String keyword = scanner.next();
				WordCount counter = new WordCount(url);
				int count = counter.countKeyword(keyword);
				System.out.println(count);
			}
	}
}
