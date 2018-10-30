
public class Progression<k>{
	protected k first;
	protected k cur;
	public Progression() {
		// TODO Auto-generated constructor stub
		first = cur ;
	}
	protected k firstValue() {
		cur = first;
		return cur;
	}
	protected k nextValue() {
		return cur;
	}
	protected void printProgression(int n) {
		System.out.println(firstValue());
		for(int i =2;i<=n;i++) {
			System.out.println(nextValue());
		}
	}
}
