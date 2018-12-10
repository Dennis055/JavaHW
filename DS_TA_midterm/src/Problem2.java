import java.awt.Label;

import javax.naming.ldap.SortControl;

public class Problem2 {
	/* 考點：sorting
	 * 直接用程式實作。
	 * Bubble sort是不停地把最小值推到最前面，就好像氣泡浮出水面一樣。
	 * 就好像有兩個人，一個是檢查數列的老師，一個是幫忙排隊的班長
	 * 所以我們就想像老師會檢查好多次(for loop)數字，檢查到一個數字
	 * 班長就會一個一個比較幫他排序位置（for loop），所以我們可以預期他有
	 * 兩個for loop , 故 T(algorithm) = O(n^2)
	 */
	public static int[] BublleSort(int[]test) {
		//老師開始從第一個同學走到最後一個同學，這樣可以確保所有人都會被排到順序
		for(int teacher = 0;teacher<test.length;teacher++) {
			//班長每排完一次，就會向前，因為在他前面的數字都是他排過的，不必再排
			for(int leader = 0;leader<test.length-1;leader++) {
				if(test[leader] > test[leader+1]) {//大的人就往隊伍後面走
					//swap(test[leader+1], test[teacher]);//更新誰是最小的
					int temp = test[leader];
					test[leader] = test[leader+1];
					test[leader+1] =temp;
				}
			}
			//所以最後最小的那個人就變成了當前隊伍最前面的人。
		}
		return test;
	}
	/*
	 * 測試我們的程式
	 */
	static int[]test = {1,23,4,5,32,5 , 11,8};
	public static void main(String[]args) {
		
		 test = BublleSort(test);
		// test = sort(test);
		int i =0;
		while(i<test.length) {
			System.out.print(test[i]+ " ");
			i++;
		}
	}
}
