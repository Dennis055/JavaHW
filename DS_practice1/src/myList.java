import javax.swing.text.Position;

public class myList {
	
	int myArray[];
	int listSize;
		
	public void append(int n ) {
		myArray[listSize]  = n;
		listSize++;
	}
	/*
	 * 在第i個地方插入ele，插入前先把後面元素移走
	 */
	public void move(int position , int ele) {
		if(position < listSize) {
			listSize++;
			for(int i = position ; i<listSize;i++) {
			myArray[i+1] = myArray[i];
			}
			myArray[position] = ele;
		}
	}
	/*
	 * 移除掉該位置的元素，移除後，後面所有元素向前
	 */
	public int delete(int position) {
		int bye = myArray[position];
		for(int i=position;i<listSize;i++) {
			myArray[i] = myArray[i+1];
		}
		listSize--;
		return bye; 
	}
	
	public int sizeOfList() {
		return listSize;
	}
	
	public void printList() {
		for(int i=0;i<listSize;i++) {
			System.out.print(i);
		}
	}
	
	public void insert(int position ,int ele) {
		for(int i =listSize; i > position -1  ;i--) {
			myArray[i] = myArray[i-1];
			myArray[position] = ele;
			listSize++;
		}
	}
	
}
