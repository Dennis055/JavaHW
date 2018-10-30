package switchDemo;

import java.util.Scanner;

public class passWord {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		String password =null;
		String SUCCESSFUL = "123456";//use uppercase to the constant
		int  i = 0;//To control the loop
		while(i<3) {
			System.out.println("please enter the password:");
			password = scanner.next();
			i++;
			if(!SUCCESSFUL.equals(password)) {//shows that password wrong!
				System.out.println("密碼輸入錯誤！剩餘"+ (3 - i) + "次！");
				if(i==3) {
					System.out.println("密碼輸入錯誤已達3次，退出系統！");
					System.exit(0);
				}
			}else {
			
				i = Integer.MAX_VALUE;//To end the loop
			}
		}	
		System.out.println("密碼正確，成功登入本系統!");
		System.out.println("........................");
	}
}
