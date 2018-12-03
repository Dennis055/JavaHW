import javax.xml.namespace.QName;

public class MyArrayList {
	int[]base;
	int size;
	int real_size ;
	public MyArrayList(int size) {
		// TODO Auto-generated constructor stub
		this.size = size;
		this.base = new int[size];
		this.real_size = 0;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public void Double() {
		size *=2;
		int[]new_base = new int[size];
		for(int i=0;i<base.length;i++) {
          new_base[i] = base[i];
		}
		this.base = new_base;
	}
	public void add( int value) {
		real_size++;
	   if(base.length==real_size) {
		   Double();
	   }
	   base[real_size-1] = value;
	}
	public int get(int index) {
		return base[index];
	}
	/*
	 * 1,2,3,4,5,6
	 */
	public int remove(int index) {
		int bye = base[index];
		int new_length = base.length-1;
		for(int i =index ;i<new_length;i++) {
			base[i] = base[i+1];
		}
		return bye;
	}
	public void setValue(int index , int value) {
		base[index] = value;
  }
	
	public static void main(String[]args) {
		MyArrayList arrayList =new MyArrayList(6);
		arrayList.add(1);
		arrayList.add( 9);
		arrayList.add( 5);
		System.out.println(arrayList.get(0));
		for(int i = 0;i<arrayList.size;i++) {
			System.out.print(arrayList.get(i)+ " ");
		}
	}
	
}