public class BubbleSort implements SortingAlgorithm {

	public void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j]; //change content not index
		a[j] = temp;
	}

	public void sort(int[] a) {
		boolean swapped = true;

		while(swapped) {
			swapped = false;
				for(int i = 0; i < a.length - 1; i++) {
					if(a[i] > a[i+1]) {
						swap(a, i, i+1); //Only for 1st pass
						swapped = true;
					}
				}
			}
	}

}
