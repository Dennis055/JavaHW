package lesson;

import java.util.Random;
import java.util.function.IntPredicate;

import javax.xml.transform.Templates;

public class quicl {
	public int partition(int[]arr , int start , int end) {
		int final_pivot = 0;
		int pivot_label = start-1;//標註一個索引為-1的start label
		int pivot = arr[end];
		/*
		 * 從索引值start開始到pivot之前，只要pivot有大於該數字，地位+1(label++) , 並且把它丟到自己前面
		 * 所以移動label此時的索引值+1以空出一個位置，然後swap兩個數字。
		 */
		for(int i=start;i<=end-1;i++) {
			if(arr[i]<=pivot) {
				pivot_label++;
				swap(arr[i],arr[pivot_label]);
			}
		}
		swap(arr[pivot_label+1], pivot);
		
		final_pivot = pivot_label +1 ;
		return final_pivot;
	}
	/*
	 * 傳入索引值為start(0) , end(length -1 )，並在分群之後對左右子集做recursive
	 */
	public int[] sort(int[]arr , int start ,int end) {
		if(start<end) {
		int pivot = partition(arr,start , end);
		sort(arr, start, pivot-1);
		sort(arr, pivot+1, end);
		}
		return arr;
	}
	public void swap(int left , int right) {
		int temp = left;
		left = right;
		right = temp;
	}

		public static void main(String[]args) {
			quicl quicl = new quicl();
			Random random = new Random();
			int[]test = new int[9];
			for(int i =0;i<test.length;i++) {
				test[i] = random.nextInt(10);
				System.out.print(test[i]+" ");
			}
			System.out.println("");
//			for(int i =0;i<test.length-1;i++) {
//				quicl.swap(test[i],test[i+1]);
//				System.out.print(test[i] + " ");
//			}
			System.out.println("");
			System.out.println("After merging");
			test = quicl.sort(test,0,test.length-1);
			for(int i =0;i<test.length;i++) {
				System.out.print(test[i] + " ");
			}
	}
	
}
