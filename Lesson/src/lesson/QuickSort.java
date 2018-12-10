package lesson;

import java.util.Random;

import javax.xml.transform.Templates;

public class QuickSort {
		int[]arr;
		public QuickSort(int[]source) {
			arr = source;
		}
		public void sort(int from , int to) {
			if(from>=to) {
				return;
			}
			int pivot = this.partition(from , to);
			sort(from, pivot);
			sort(pivot+1, to);
		}
		public  int partition(int from , int to){
			int pivot = to;
			int swap_window = -1;
			int[] ls  = this.arr;
			for(int window = 0;window<to;window++) {
				if(swap_window<0) {
					swap(ls[window+1], ls[window]);
				}
				if(ls[window]<pivot) {
					window++;
					swap_window++;
				}else if(ls[window]>pivot) {
					swap(ls[swap_window], ls[window]);
					window++;
				}
			}
			return pivot;
		}
		
		public void swap(int first , int last) {
			 int temp = this.arr[first];
			 this.arr[first] = this.arr[last];
			 this.arr[last] = temp;
		}
		public int getTo() {
			int[] ls = this.arr;
			int to = ls.length;
			return to ;
		}
		public static void main(String[]args) {
			int[]anarray = new int[8];
			Random random = new Random();
			for(int i = 0 ; i<anarray.length;i++) {
				 anarray[i]= random.nextInt(10);
				 System.out.print(anarray[i] + " ");
			}
			System.out.println("");
			System.out.println("After merging");
			QuickSort sorter = new QuickSort(anarray);
			int to = sorter.getTo();
			sorter.sort(0, to);
			for(int i = 0 ; i<anarray.length;i++) {
				 System.out.print(sorter.arr[i] + " ");
			}
			
		}
}
