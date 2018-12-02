import java.time.chrono.MinguoChronology;
import java.time.format.TextStyle;

import javax.xml.transform.Templates;

import org.omg.PortableServer.ServantActivator;

public class SelectionSort {
//		public int[]sort(int[]ls){
//			
//			int cursor = 0;
//			
//			int collect[] = new int[ls.length];
//			for(int i =1;i<ls.length;i++) {
//				for(int j =i;j<ls.length;j++) {
//				if(ls[cursor]>ls[j]) {
//					cursor = j;
//				}
//			}
//			swap(ls[cursor], ls[i-1]);
//			collect[i-1] = ls[i-1];
//		}	
//			return collect;
//		}
	public void sort(int[]ls) {
		int i  ;
		for(i = 0;i<ls.length;i++) {
			int min = i;
			for(int j = i+1;j<ls.length;j++) {
				if(ls[min]>ls[j])
					min = j;
				else
					continue;
			}
			swap(ls,i ,min);
		}
	}
	public static void swap(int []arr , int left , int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
		public static void swap(int left , int right) {
			int temp = left;
			left = right;
			right = temp;
		}
		public static void main(String[]args) {
			int[]ls = {22,31,5,1,4,23,22};
			SelectionSort sorter = new SelectionSort();
			sorter.sort(ls);
			for(int i=0 ;i<ls.length;i++) {
				System.out.print(ls[i] +  " ");
			}
		}
}
