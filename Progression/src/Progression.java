
public class Progression {
	protected long first;
	protected long cur;
	public Progression() {
		// TODO Auto-generated constructor stub
		first = cur  = 1;
	}
	protected long firstValue() {
		cur = first;
		return cur;
	}
	protected  long nextValue() {
		++cur;
		return cur;
	}
	protected void printProgression(int n ) {
		System.out.println(firstValue());
		for(int i =2;i<=n;i++) {
			System.out.println(nextValue());
		}
		System.out.println();
	}
	
}
