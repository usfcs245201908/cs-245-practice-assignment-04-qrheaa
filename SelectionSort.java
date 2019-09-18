public class SelectionSort implements SortingAlgorithm {

	public void swap(int[] a, int i, int j) {
			int temp = a[i];
			a[i] = a[j]; //change content not index
			a[j] = temp;
		}

		//Find minimum:
	public int findmin(int[] a, int start) {
			int min = start;
			for(int i = start + 1; i < a.length; i++) { //start +1 because min is start
				if(a[i] < a[min]) { //i is start + 1 and increments
					min = i;
				}
			}
			return min;

}

	public void sort(int[] a) {
		for(int i = 0; i < a.length; i++) {
			swap(a, i, findmin(a,i)); // j is min value to swap with i
		}

	}

}