package array_practice;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class notice {
		public static void main(String[]args) {
	Scanner scanner = new Scanner(System.in);
			String A = "73372972";
			String B = "22315462";

			String C1 = "91903003";
			String C2 = "16228722";
			String C3 = "03270598";

			String D1 = "163";
			String D2 = "983";
			String D3 = "814";
			System.out.println("請輸入末三碼：");
			String X = scanner.next();
			ArrayList<String>list = new ArrayList<>();
			list.add(A);
			list.add(B);
			//..
			for(int i =0;i<list.size();i++) {
				if(X==list.get(i).substring(5)) {
					System.out.println("請輸入完整8碼：");
					String S = scanner.next();
					
				}else {
					System.out.println("真可惜，槓龜！");
				}
			}


		}
}
