import java.util.Base64;

public class ArithProgression extends Progression{
	protected long r;
	public ArithProgression() {
		// TODO Auto-generated constructor stub
		this(1,1);
	}
	ArithProgression(int a,int increment){
		first = a;
		r = increment;		
	}
	protected long nextValue() {
		cur += r;
		return cur;
	}

}
