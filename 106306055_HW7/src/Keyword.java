
public class Keyword {
	public String name;
	public int count;
	public double weight; //To get the request of the teacher
	
	public Keyword(String name,int count , double weight){
		this.name = name;
		this.count = count;
		this.weight = weight;
	}
	public String toString() {
		return "[" + name + "," + count + "," + weight + "]";	
			}	
	
}
