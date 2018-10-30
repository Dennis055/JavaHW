import java.util.Scanner;

public class Main {
		public static void main(String[]args) {
			// To create the object we need
			System.out.println("please follow the command tutorial!");
			System.out.println("=========================================");
			Scanner scanner = new Scanner(System.in);
			KeywordList keywordList  = new KeywordList();
			
			
		while(scanner.hasNext()) {//For user type the input
			String cmd = scanner.next();
			switch (cmd) {//use switch to control the results
			case "add":
			{   
				System.out.println("add ,add the elements!");
				//use block to reuse variable
				String name = scanner.next();
				int count = scanner.nextInt();
				double weight = scanner.nextDouble();
				keyWord k = new keyWord(name, count, weight);
				keywordList.add(k);
				break;
			}
			case "outputIndex":
			{
				System.out.println("outputIndex ,enter int and it will show the index");
				int index = scanner.nextInt();
				keywordList.outputIndex(index);
				break;
			}
			case "outputCount":
			{
				System.out.println("outputCount , enter count to search count");
				int count = scanner.nextInt();
				keywordList.outputCount(count);
				break;
			}
			case "outputHas":
			{ 
				System.out.println("outputHas, enter string to search the words!" );
				String pattern = scanner.next();
			keywordList.outputName(pattern);
				break;
			}
			case "outputName":{
				System.out.println("outputName, enter name and output all keywords whose name is equal to s");
				String name = scanner.next();
				keywordList.outputName(name);
				break;
			}
			case "outputFirstN":
			{
				System.out.println("outputFirstN,enter n and output the first n keywords");
				int n = scanner.nextInt();
				keywordList.outputFirstN(n);
				break;
			}
			case "outputScore":
			{
				System.out.println("outputScore , Output the score of the whole list");
				keywordList.outputScore();
				break;
			}
			case "deleteIndex":
				{
			 int index = scanner.nextInt();
			 keywordList.deleteIndex(index);
			 break;
				}
			case "deleteCount":
				{
				int count = scanner.nextInt();
				keywordList.deleteCount(count);
				 break;
				}
			case "deleteHas":
				{
				String pattern = scanner.next();
				keywordList.deleteHas(pattern);
				 break;
				}
			case "deleteName":
				{
			String name = scanner.next();
			keywordList.deleteName(name);
			 break;
				}
			case "deleteFirstN":
				{
					
				int n = scanner.nextInt();
				keywordList.deleteFirstN(n);
				 break;
				}
			case "deleteAll":
			{
				keywordList.deleteAll();
				 break;
			}
			default:
				break;
			}	//The end of my switch
		}	//Reenter 
	}	//main method
} //My class
