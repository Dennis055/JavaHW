
public class GeomProgression extends Progression<Long>{
	protected Long b;
	protected GeomProgression() {
		// TODO Auto-generated constructor stub
		this(1,1);
	}
	GeomProgression(long a,long base){
		first = a;
		b = base;
	}
	protected Long nextValue() {
		cur *= b;
		return cur;
	}
	
}
