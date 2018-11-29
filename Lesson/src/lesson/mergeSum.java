package lesson;

public class mergeSum {
		public static int mergeSum(int[]source ,int from , int to) {
			int total_sum = 0;
			int length = source.length;
			int s1 = mergeSum(source, 0 , length/2);
			int s2 = mergeSum(source, length/2 , length);
			//total_sum = sum(s1,s2);
			return total_sum;
		}
		
		
		
		public static int sum(int[] s1 , int[] s2) {
			int sum =0;
			for(int i=0;i<s1.length;i++) {
				sum += s1[i];
			}
			for(int i = 0 ;i<s2.length;i++) {
				sum += s2[i];
			}
			return sum;
		}
}
