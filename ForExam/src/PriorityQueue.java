
public class PriorityQueue {
	Heap queue = new Heap();
	int index = 1; //Recording the place of element
	int front = 0;
	public void insert(int data) {
		queue.add(data);
		queue.minHeapify(index-1);
		index++;
	}
	public void removeMin() {
		queue.delete(this.min());//必須更新min才行
		front++;
		//queue.minHeapify(index-1);
	}
	
	public int min() {
		return queue.min();
	}
	
	public int[] insertionSort(int[]arr) {
		this.queue = new Heap(arr.length);
		this.index = 1;
		this.front = 0;
		for(int i=0;i<arr.length;i++) {
			insert(arr[i]);
		}
		for(int i =0;i<arr.length;i++) {
			arr[i] = queue.min();
			System.out.print(this.min() + " ");
			removeMin();
		}
		return arr;
	}
	
	
	public static void main(String[]args) {
		PriorityQueue queue = new PriorityQueue();
		//12345
		queue.insert(3);
		System.out.println(queue.queue.heap[0]);
		queue.insert(1);
		queue.insert(5);
		queue.insert(2);
		queue.insert(4);
		System.out.println(queue.min());
		queue.removeMin();
		System.out.println(queue.min());
		queue.removeMin();
		System.out.println(queue.min());
//		int test[] = {1,3,33,52,68,12,77,39,5,11};
//		 test = queue.insertionSort(test);
//		 System.out.println(" ");
//		 for(int i = 0;i<test.length;i++) {
//			 System.out.print(test[i] + " ");
//		 }
		
	}
}
