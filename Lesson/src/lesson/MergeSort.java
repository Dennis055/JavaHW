package lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import javax.swing.text.InternationalFormatter;

import org.omg.CORBA.PUBLIC_MEMBER;

public class MergeSort {
		public int[] sort(int[]source){
		int[]sorted_arr;
		int[]arr = Arrays.copyOf(source, source.length);
		if(arr.length<2) {
			sorted_arr =arr ;
		}
		 int middle = (int) Math.floor((source.length)/2);
		 int[]left = Arrays.copyOfRange(arr, 0, middle);
		 int[]right = Arrays.copyOfRange(arr, middle, arr.length);
		 int i = 1;
		 int smaller_l = left[0];
		 int smaller_right = right[0];
		 while(i<left.length) {
			 if(smaller_l>left[i])
				swap(smaller_l,left[i]);
			 i++;
		 }
		 while(i<right.length) {
			 if(smaller_right>right[i]) {
				 swap(smaller_right, right[i]);
			 }
			 i++;
		 }
		  sorted_arr = merge(left, right);
		 
		 return sorted_arr;
		 	
	}
		
		
		public static int[] merge(int[]first , int []second) {
//			int[]sorted ;
//			int j =0;
//			for(int i = 0;i<second.length;i++) {
//				if(first[i]>second[j]) {
//					
//				}
//			}
			int[]sorted = new int[first.length+second.length];
			int i =0;
			int j = 0;
			int new_times = 0;
			while(i<first.length && j<second.length) {
				if(first[i]<second[j]) {
					sorted[new_times] = first[i];
					i++;
				}else {
					sorted[new_times] = second[j];
					j++;
				}
				new_times++; 
			}
			/*
			 * i = 0 , sort.length = 4 , i = 3
			 * i = 1 , sort.length = 5,i=4
			 * i = 2 ,  6  , i=5
 			 */
			while(i<first.length) {
				sorted[i+first.length-1] = first[i];
				i++;
			}
			while(j<second.length) {
				sorted[j+first.length-1] = second[j];
				j++;
			}
			return sorted;
		}
		
		public static void swap(int from , int to) {
			int temp = from;
			from = to;
			to = temp;
		}
			public static void main(String[]args) {
				int[]ls = new int[8];
				Random random = new Random();
				for(int i=0;i<8;i++) {
					ls[i] = random.nextInt(10);
				}
				MergeSort sorter = new MergeSort();
				System.out.println(ls);
				sorter.sort(ls);
				System.out.println(ls);
				
			}
}
