import java.net.NetworkInterface;

public class Queue {
		int[]queue;
		int size;
		int front = 0;
		int rear = 0;
		int queue_lenth = rear - front;
		public Queue(int size) {
			// TODO Auto-generated constructor stub
			this.size = size;
			this.queue = new int [size];
		}
		public Queue() {
			// TODO Auto-generated constructor stub
			this.size = 4;
			this.queue = new int[size];
		}
		public int size() {
			return this.size;
		}
		public boolean isEmpty() {
			return front ==rear;
		}
		public void enqueue(int data) {
			if(rear==size-1)
				resize();
			queue[rear]= data;
			rear++;
		}
		public int dequeue() {
			if(isEmpty()) {
				System.out.println("Invalid operand");
			}
			int bye = queue[front];
			// null,1,2,3,4,5
			front++;
			return bye;
		}
		public void resize() {
			size *=2;
			int[]curr = new int[size];
			for(int i =0;i<queue.length;i++) {
				curr[i] = queue[i];
			}
			this.queue = curr;
		}
		
		public static void main(String[]args) {
			Queue test = new Queue();
			test.enqueue(3);
			test.enqueue(5);
			test.enqueue(6);
			test.enqueue(7);
			test.enqueue(8);
			System.out.println(test.dequeue());
			System.out.println(test.dequeue());
			System.out.println(test.dequeue());
			System.out.println(test.dequeue());
			System.out.println(test.size());
			System.out.println(test.queue_lenth);
		}
}
