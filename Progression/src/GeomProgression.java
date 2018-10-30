import java.io.FilterInputStream;

public class GeomProgression extends Progression{
	protected long b;
	public GeomProgression() {
		// TODO Auto-generated constructor stub
		this(1,1);
	}
	GeomProgression(int a,int base){
		first = a;
		b  = base; 
	}
	protected long nextValue() {
		cur *= b;
		return cur;
	}
}
