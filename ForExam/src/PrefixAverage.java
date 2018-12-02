
public class PrefixAverage {
		/*
		 * O(n^2) 
		 */
		public int[] prefixAve(int[]timeSeries) {
			int[]window = new int[timeSeries.length];
			
			for(int i=0;i<timeSeries.length;i++) {
				int sum = 0;
				for(int j = 0 ;j<=i;j++) {
					sum += timeSeries[j];
				}
				int average = sum/(i+1);
				window[i] = average;
			}
			return window;
		}
		public double []improve(int[]timeSeries){
			double[]window = new double[timeSeries.length];
			double sum = 0;
			for(int i =0 ; i<timeSeries.length;i++) {
				sum += timeSeries[i];
				double average  = sum/(i+1);
				window[i] = average;
			}
			return window;
		}
		
		public static void main(String[]args) {
			PrefixAverage pp = new PrefixAverage();
			int[] test= {2,3,4,5,6,7,8};
			 int[]price = pp.prefixAve(test);
			 for(int i =0;i<price.length;i++) {
				 System.out.print(price[i] + " ");
			 }
			 System.out.println("");
			 double [] price2 = pp.improve(test);	 
			 for(int i =0;i<price2.length;i++) {
				 System.out.print(price2[i] + " ");
			 }
		}
}

