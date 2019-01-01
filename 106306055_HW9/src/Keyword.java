
public class Keyword {
	
	public int count;
	public String name;
	
	public Keyword(String name ,  int count) {
		// TODO Auto-generated constructor stub
		this.name  = name;
		this.count = count;
	}
	
	public String toString() {
		return "[" + name + ',' + count + "]";
	}
}
