import java.util.Currency;


public class GeomProgression <T extends Number> extends Progression<T>{
	public GeomProgression(T first,T base) {
		super(first);
		this.base = base;
		// TODO Auto-generated constructor stub
	}
	private T base;
	
	private T multiply(T a, T b) {

		if(a instanceof Integer) {
			Integer erasedValue = a.intValue()*b.intValue();
			return (T) erasedValue;
		}
		else if(a instanceof Long){
			Long eraseValue = a.longValue() *b.longValue();
			return (T)eraseValue;
		}
		else if(a instanceof Float){
			Float eraseValue = a.floatValue() *b.floatValue();
			return (T)eraseValue;
		}
		else if(a instanceof Double) {
			Double eraseValue = a.doubleValue()*b.doubleValue();
			return(T)eraseValue;
		}
		else {
			return null;
		}
		
	}
	public T nextValue() {
		curr = multiply(curr, base);
		return curr;
	}

}
