import java.util.ArrayList;

public class Stack {
		ArrayList<Node> arrayList  = new ArrayList<>();
		public void pop() {
		 arrayList.remove(arrayList.size());
		}
		public void push(Node node) {
			arrayList.add(arrayList.size(),node);
		}
}
