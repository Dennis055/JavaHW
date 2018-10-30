
public abstract class Progression<T> {
	protected T first;
	protected T curr;
	public Progression(T first) {
		this.first = first;
		this.curr = first;
	}
	
	public T firstValue() {
		curr  = first;
		return first;
	}
	public abstract T nextValue();
	
	public void printProgression(int n) {
		//System.out.println(firstValue());
		String result = String.valueOf(firstValue());
		for(int i=1;i<=n;i++) {
			//System.out.println("" + nextValue());
		result += " "+String.valueOf(nextValue());
		}
		System.out.println(result);
	}
}
