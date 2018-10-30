
public class double_GemoProgression extends Progression<Double>{
	protected double d;
	public double_GemoProgression() {
		// TODO Auto-generated constructor stub
		this(1,1);
	}
	double_GemoProgression(double a,double base){
		first = a;
		d = base;
	}
	protected double nextValue(double base) {
		cur *= base;
		return cur;
	}
}
