package switchDemo;

public class calcMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2015;
		double money = 800;
		while(money < 2000) {
			year++;
			money *= 1.25;
		}
		String string = String.format("%d年，支付寶市值達到%.2f（億元)",year,money);
		System.out.print(string);
	}
}
