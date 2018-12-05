
public class Heap {
	int[]heap;
	int pos,size;
	public Heap(int size) {
		this.size = size;
		this.heap = new int[size];
		this.pos = 1;
	}
	public Heap() {
		// TODO Auto-generated constructor stub
		this.size = 2;
		this.heap = new int[size];
		this.pos = 1;
	}
	public int getSize() {
		return this.pos;
	}
	public boolean isEmpty() {
		return pos==1;
	}
	public void add(int item) {
		if(pos==heap.length)
			reSize();
		if(isEmpty()) {
			heap[pos] = item;
			pos++;
			return;
			}
		heap[pos++] = item;
		minHeapify(pos-1);
	}
	public int delete(int item) {
		int bye=0;
		boolean found = false;
		int start = 0;
		for(int i =0;i<heap.length;i++) {
			if(heap[i]==item) {
				found = true;
				start = i;
				 bye = heap[i];
			}
		}
		if(found==false)
			throw new IllegalStateException("Item doens't exist!");
		//接著處理如果有找到的情況，我們把目前進度-1
		pos--;
		for(int i=start;i<pos;i++) {//從i開始一直到最後面，把後面的數字都搬到前面
			heap[i] = heap[i+1];
		}
		for(int i =pos;i>0;i--) {
			minHeapify(i);//重新調整
		}
		return bye;
	}
	public void minHeapify(int index) {//由下而上建構，通常用於一個一個放入時會這樣做
		int child = index;
		int parent = child/2;
		while(parent>0 && heap[parent]>heap[child]) {
			int temp = heap[parent];
			heap[parent] = heap[child];
			heap[child] = temp;
			
			child  = parent;
			parent = child/2;
		}
	}
	public int min() {
		return heap[1];
	}
	public void reSize() {
		size = size*2;
		int[]curr = new int[size];
		for(int i =0;i<heap.length;i++) {
			curr[i] = heap[i];
		}
		heap = curr;
	}
	public int[] heapSort(int[]arr) {
		int length = arr.length;
		int[]collect = new int[arr.length];
		for(int i =arr.length-1;i>=0;i--) {
			 add(arr[i]);//add method就會heapify了
			 System.out.print(arr[i] + " ");
		}
		System.out.println("");
		for(int i = 1;i<length+1;i++) {
			collect[i-1] = delete(min());
			System.out.print(collect[i-1] + " ");
		}
		return collect;
	}
	public static void main(String[]args) {
		Heap heap = new Heap();
//		heap.add(7);
//		heap.add(5);
//		heap.add(3);
		for(int i = 5;i>0;i--) {
			heap.add(i);
			System.out.println(heap.min());
		}
		System.out.println("");
		Heap sorter = new Heap();
		int[]test = {1,4,2,6,7,5,3};
		test = sorter.heapSort(test);
	}
}
