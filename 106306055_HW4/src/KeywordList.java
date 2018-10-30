import java.util.ArrayDeque;
import java.util.ArrayList;

import javax.swing.event.ListSelectionEvent;

public class KeywordList {

	private ArrayList<keyWord> list;

	public KeywordList() {
		// TODO Auto-generated constructor stub
		this.list = new ArrayList<>();
	}

//		
//	public void add(keyWord keyWord) {
//		if(list.isEmpty()) {
//			list.add(0, keyWord);
//			System.out.println("The first element");
//		}else {
//			list.add(list.size(), keyWord);
//				}
//			}
	
	public void add(keyWord keyWord) {
		for(int i=0;i<list.size();i++) {
			keyWord k = list.get(i);
			
			if(k.count>=keyWord.count) {
				list.add(i,keyWord);
				System.out.println("Done!");
				return;
			}
		}
		list.add(keyWord);
		System.out.println("Done!");
	}

	public void outputIndex(int n) {
		if (n > list.size()) { //because index start = 0
			System.out.println("Invalid Operation");
			return;
		}
		ArrayList<keyWord> results = new ArrayList<>();
		int turn_to_index = n-1;
		keyWord keyWord = list.get(turn_to_index);
		results.add(keyWord);
		printKeywordList(results);
	}

	public void outputHas(String pattern) {
		ArrayList<keyWord> results = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			keyWord keyWord = list.get(i);
			if (keyWord.name.contains(pattern)) {
				results.add(keyWord);
			}
		}//Loop end	
		//Print results
		if (results.isEmpty()) {
			System.out.println("not found!");
		} else 
		{
			printKeywordList(results);
		}
	}

	public void outputCount(int c) {
		ArrayList<keyWord>results = new ArrayList<>();
		for(int i =0;i<=list.size();i++) {
			keyWord k = list.get(i);
			if(k.count==c) {
				results.add(k);
			}
			if(results.isEmpty()) {
				System.out.println("Not found!");
			}else {
				printKeywordList(results);
			}
		}
	}

	public void outputName(String myname) {
		ArrayList<keyWord> results = new ArrayList<>();
		for(int i =0;i< list.size();i++) {
			keyWord k = list.get(i);
			if(k.name.equals(myname)) {
				results.add(k);
			}
		if(results.isEmpty()) {
			System.out.println("Not found!");
		}else {
			printKeywordList(results);
			}
		}
	}

	public void outputFirstN(int n) {
		if (n > list.size()) {
			System.out.println("Invalid Operation!");
			return;
		}
		ArrayList<keyWord> results = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			keyWord keyWord = list.get(i);
			results.add(keyWord);//collect all the elements
		}
		printKeywordList(results);
	}

	public void outputScore() {
		double sum = 0;
		for(int i=0;i<list.size();i++) {
			keyWord keyWord = list.get(i);
			int tempcount = keyWord.count;
			double tempweight = keyWord.weight;
			double send_value = tempweight*tempcount;
			sum += send_value;
		}
		System.out.println("Score:" + sum);
	}

	public void deleteIndex(int n) {
		if (n >= list.size()) {
			System.out.println("Invalid Operation!");
			return;
		}
		list.remove(n);
		System.out.println("Done");
	}

	public void deleteCount(int c) {
		ArrayList<keyWord> found = new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			keyWord keyWord = list.get(i);
			if(keyWord.count==c) {
				found.add(keyWord);
			}
		}if(found.isEmpty()) {
			System.out.println("Not found!");
		}else {
			list.remove(found);
			System.out.println("Done!");
		}
	}

	public void deleteHas(String pattern) {
		ArrayList<keyWord> found = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			keyWord keyWord = list.get(i);
			if (keyWord.name.contains(pattern)) {
				found.add(keyWord);
			}
		}
		if (found.isEmpty()) {
			System.out.println("not found");
		} else {
			list.remove(found);
			System.out.println("Done");
		}
	}

	public void deleteName(String name) {
		ArrayList<keyWord>found = new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			keyWord keyWord = list.get(i);
			if(keyWord.name.equals(name)) {
				found.add(keyWord);
			}
		}
		if(found.isEmpty()) {
			System.out.println("Not found!");
		}else {
			list.remove(found);
			System.out.println("Done!");
		}
	}

	public void deleteFirstN(int n) {
		if (n > list.size()) {//To check the input range
			System.out.println("Invalid Operation!");
			return;//Exit the method
		}
		for (int i = 0; i < n; i++) {
			list.remove(0);//remove first nth number
		}
		System.out.println("Done");
	}

	public void deleteAll() {
		for(int i =0; i<list.size();i++) {
			list.remove(0);
		}
		System.out.println("Done!");
	}

	private void printKeywordList(ArrayList<keyWord> list) {
		StringBuilder sBuilder = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			keyWord keyWord = list.get(i);
			if (i > 0) {
				sBuilder.append("");
			}
			sBuilder.append(keyWord.toString());
		}
		System.out.println(sBuilder.toString());
	}
}
