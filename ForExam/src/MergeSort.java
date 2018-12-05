
public class MergeSort {
	private int[] a;
	public MergeSort(int[] anArray) {
		a = anArray;
	}

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
		MergeSort firstSorter = new MergeSort(first);
		MergeSort secondSorter = new MergeSort(second);
		firstSorter.sort();
		secondSorter.sort();
		merge(first, second);
	}
	private void merge(int[] first, int[] second) {
		int iFirst = 0; // Next element to consider in the first array
		
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
		while (iFirst < first.length) {
			a[j] = first[iFirst];
			iFirst++;
			j++;
		}
		while (iSecond < second.length) {
			a[j] = second[iSecond];
			iSecond++;
			j++;
		}
	}
}
