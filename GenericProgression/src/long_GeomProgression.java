import java.security.AlgorithmConstraints;

public class long_GeomProgression extends Progression<Long>{
	protected long l;
	public long_GeomProgression() {
		// TODO Auto-generated constructor stub
		this(1,1);
	}
	long_GeomProgression(long a,long base){
		first = a;
		l = base;
	}
	protected Long nextValue() {
		cur *= l;
		return cur;
	}

}
