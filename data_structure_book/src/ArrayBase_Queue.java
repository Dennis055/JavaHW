
public class ArrayBase_Queue {
	int size;
	int[]base = new int[size];
	int place =0;
	public ArrayBase_Queue(int size) {
		// TODO Auto-generated constructor stub
		this.size = size;
	}
	public int size() {
		return this.size;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public void enqueue(int value) {
		base[place] = value;
		place++;
	}
	public int dequque() {
		int bye = base[0];
		for(int i = 0;i<place-1;i++) {
			base[i] = base[i+1];
		}
		return bye;
	}
	
}
