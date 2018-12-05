import javax.xml.crypto.Data;
import javax.xml.transform.Templates;

public class InsertionSort {
		
	/*
	 *  2 queue
	 *  number
	 *  compare
	 *  for for
	 *  
	 */
	public void insert(int[]arr , int card , int Nfront) {
		int j = Nfront; //設定前面有幾個數字
		while(card<arr[j]) {
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1] = card;
	}
	
	
	
	public void sort(int[]arr) {
		for(int i =2;i<arr.length;i++) {
			insert(arr, i, i-1);
		}
	}
		public static void main(String[]args) {
			InsertionSort sort = new InsertionSort();
			int[]test = {2,1,4,22,32,8,20,3,7,11};
			sort.sort(test);
			int i=0;
			while(i<test.length) {
				System.out.print(test[i] + " ");
				i++;
			}
		}
}





