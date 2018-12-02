import java.util.Stack;

public class StockSpan {
		static void calculateSpan(int[]price , int n , int[]S) {
			Stack<Integer>stack = new Stack<>();
			stack.push(0);
			S[0] = 1;
			for(int i =1 ; i<n;i++) {
				while(!stack.empty()&&price[stack.peek()]<=price[i]) {
					stack.pop();
				}
				 S[i] = (stack.empty())? (i + 1) : (i - stack.peek()); 
				 stack.push(i);
			}
		}
}
