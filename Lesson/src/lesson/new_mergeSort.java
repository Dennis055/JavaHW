package lesson;

import java.util.Arrays;
import java.util.Random;

public class new_mergeSort {
		private int[] a;
		public new_mergeSort(int[]source) {
			// TODO Auto-generated constructor stub
			a = source;
		}
	
//		public int[] mergesort(int[]sourcearr ) {
//			int length = sourcearr.length;
//			int middle = (int) Math.floor(length/2);
//			int[]left = Arrays.copyOfRange(sourcearr, 0, middle);
//			int[]right = Arrays.copyOfRange(sourcearr, middle, length);
//			return merge(mergesort(left) , mergesort(right) );
//		}
		public void sort() {
			if (a.length <= 1) //divide the partition into minimum 2
				return;
			int[] first = new int[a.length / 2];
			int[] second = new int[a.length - first.length];
			// Copy the first half of a into first, the second half into second
			for (int i = 0; i < first.length; i++) {
				first[i] = a[i];
			}
			for (int i = 0; i < second.length; i++) {
				second[i] = a[first.length + i];
			}
			new_mergeSort firstSorter = new new_mergeSort(first);
			new_mergeSort secondSorter = new new_mergeSort(second);
			firstSorter.sort();
			secondSorter.sort();
			merge(first, second);
		}

	
//		public void merge(int[]left , int[]right){
//			int left_cursor = 0;
//			int right_cursor = 0;
//			int []sorted = new int[left.length+right.length];
//			int time  = 0;
//			while(left_cursor<left.length &&right_cursor<right.length) {
//				if(left[left_cursor]<right[right_cursor]) {
//					sorted[time] = left[left_cursor];
//					left_cursor++;
//					
//				}else{
//					sorted[time] = right[right_cursor];
//					right_cursor++;
//				}
//				time++;
//			}
//			while(left_cursor<left.length) {
//				sorted[time] = left[left_cursor];
//				left_cursor++;
//				time++;
//			}
//			while(right_cursor<right.length) {
//				sorted[time] = right[right_cursor];
//				right_cursor++;
//				time++;
//			}
//			//return sorted;
//		}
		
		
		private void merge(int[] first, int[] second) {
			int iFirst = 0; // Next element to consider in the first array
			//like draw a card , and the card was a variable
			int iSecond = 0; // Next element to consider in the second array
			int j = 0; // Next open position in a

			// we sort the array  a with the index j
			while (iFirst < first.length && iSecond < second.length) { //you can continue drawing 
				if (first[iFirst] < second[iSecond]) {
					a[j] = first[iFirst];
					iFirst++;
				} else {
					a[j] = second[iSecond];
					iSecond++;
				}
				j++;
			}
			// Note that only one of the two loops below copies entries
			// Copy any remaining entries of the first array
			while (iFirst < first.length) {
				a[j] = first[iFirst];
				iFirst++;
				j++;
			}
			// Copy any remaining entries of the second half
			while (iSecond < second.length) {
				a[j] = second[iSecond];
				iSecond++;
				j++;
			}
		}
		public static void main(String[]args) {
			Random random = new Random();
			int[]test = new int[9];
			for(int i =0;i<test.length;i++) {
				test[i] = random.nextInt(10);
				System.out.print(test[i]+" ");
			}
			System.out.println("");
			System.out.println("After merging");
		
			new_mergeSort sorter = new new_mergeSort(test);
			sorter.sort();
			for(int i =0;i<test.length;i++) {
				System.out.print(sorter.a[i]+" ");
			}
			
		}
}
