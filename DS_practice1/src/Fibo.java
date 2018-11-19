import java.util.ArrayList;

public class Fibo {
	ArrayList<Integer>fibo = new ArrayList<>();
	{
		fibo.add(0);
		fibo.add(1);
	}
	Integer get(int n) {
		if(n>=fibo.size())
			for(int i=fibo.size();i<=n;i++) {
				fibo.add(fibo.get(i-1) + fibo.get(i-2));
			}
		return fibo.get(n);
	}
	public static void main(String[]args) {
		Fibo fibo = new Fibo();
		for(int i=0;i<20 ;i++) {
			System.out.print(fibo.get(i) + " ");
		}
		
	}
}
