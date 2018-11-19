package Stack;

public class stackMain {
	public static void main(String[]args) {
		int N = 5;
		int data;
		Stack stack  = new Stack(N);
		for(int i = 0 ; i< N;i++) {
			if(!stack.isFull()) {
				stack.push(i + 'A');
				System.out.println();
			}else
				System.out.println("The stack is full");
		}
		for(int i=0;i<N;i++) {
			if(!stack.isEmpty()) {
				data = stack.pop();
				System.out.print(data + "");
			}
			else
				System.out.println("Error , stack is empty!");
		}
	}
}
