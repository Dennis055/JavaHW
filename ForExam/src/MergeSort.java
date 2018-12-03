import javax.swing.text.AbstractDocument.LeafElement;

public class MergeSort {
		public void execSort(int[]arr) {
			sort(arr, 0, arr.length-1);
		}
		public void sort(int[]arr , int start , int end) {
			int[]temp = new int[arr.length];
			if(start < end ) {
				int center =  (start + end) / 2;
				sort(arr, start, center);
				sort(arr, center + 1, end);
				merge(arr, start, center);;
			}
		}
		public static void merge(int[]arr ,int start ,int end) {
			int left = start-1;
			
			
		}
}
