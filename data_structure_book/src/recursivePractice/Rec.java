package recursivePractice;

public class Rec {
		public int sum(int n) {
			int sum = 0;
			if(n==1) {
				sum = 1;
			}
			else {
				sum  = sum(n-1) +  n;
			}
			return sum;
		}
		
		
}

