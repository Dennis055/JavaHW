
public class Progression <T>{
		protected T first;
		protected T cur;
		public Progression() {
			// TODO Auto-generated constructor stub
			first = cur;
		}
		protected T firstValue() {
			first = cur ;
			return cur;
		}
		protected T nextValue() {
			return cur;
		}
		protected void printProgression(int n) {
			System.out.println(firstValue());
			for(int i =2;i<=n;i++) {
				System.out.println(nextValue());
			}
		}
}
