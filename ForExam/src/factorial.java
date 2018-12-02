import javax.xml.bind.ValidationEvent;

public class factorial {
	public int factorial( int level) {
		if(level==0) {
			return 1 ;
		}else {
			return  level*factorial( level-1);
		}
		
	}
	public int fibo(int level){
		int variable;
		if(level==0||level==1) {
			if(level==0)
				variable = 0 ;
			else
				variable = 1;
		}else {
			variable = fibo(level -1 )+ fibo(level-2);
		}
		return variable;
	}
	
	public static void main(String[]args) {
		factorial ff = new factorial();
		System.out.println(ff.factorial(3));
		for(int i =0;i<6;i++) {
			System.out.print(ff.fibo(i) + " ");
		}
	}
	
}
