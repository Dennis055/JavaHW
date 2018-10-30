import javax.xml.transform.Templates;

public class FiboProgression extends Progression {
	protected long prev;
	public FiboProgression() {
		// TODO Auto-generated constructor stub
		this(1,2);
	}
	FiboProgression(int a,int rule){
		first = a;
		prev = first - rule;
	}
	protected long nextValue() {
		long temp = prev; // an-1
		prev = cur;//an -> an-1
		cur += temp;
		return cur;
	}
}
