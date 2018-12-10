package try_catch_practice;

import java.util.ArrayList;
import java.util.Currency;
import java.util.ListResourceBundle;

public class DS_pseudo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<Integer>lisrt = new ArrayList<>();
			for(int i =0;i<5;i++) {
				lisrt.add(i);
			}
			ArrayList<Integer>result = improve(lisrt);
			
			for(int i =0 ; i<result.size();i++) {
				System.out.println(result.get(i));
			}
	}
	
	/*
	 * 列出執行次數，並統計窗口內的移動最小值
	 */
//	public static ArrayList<Integer> arrayMin(ArrayList<Integer>list){
//		ArrayList<Integer> window = new ArrayList<>();
//		for(int i=1;i<list.size()+1;i++) {
//			int local_min = 0;
//			for(int j=0;j<i;j++) {
//				if(j==0){
//					local_min = list.get(0);
//				}
//			 if(local_min > list.get(i)) {
//				local_min = list.get(j);
//				}
//			}
//			window.add(local_min);
//		}
//		return window;
//	}
	public static ArrayList<Integer>improve(ArrayList<Integer>list){
		ArrayList<Integer>window = new ArrayList<>();
		int moving_min = list.get(0);
		window.add(moving_min);
		for(int i =1;i< list.size();i++) {
			int current = list.get(i);
			if(moving_min>current) {
				moving_min = current;
			}
			window.add(moving_min);
		}
		return window;
	}
	public static ArrayList<Integer>prefixMean(ArrayList<Integer>list){
		ArrayList<Integer> averagelist = new ArrayList<>();
		int sum  = list.get(0);
		averagelist.add(sum);
		for(int i =1;i<list.size();i++) {
			sum +=list.get(i);
			int average  = sum/(i+1);
			averagelist.add(average);
		}
		return averagelist;
	}

}
