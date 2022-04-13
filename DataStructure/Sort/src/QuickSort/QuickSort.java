package QuickSort;

public class QuickSort {
	public void QuickS(int[] arr, int low, int high) {
		if (low < high) {
			int pi = Partition(arr, low, high);
			
			QuickS(arr, low, pi - 1);
			QuickS(arr, pi + 1, high);
		}
	}

	private static int Partition(int[] arr, int low, int high) {
		int p = high;
		int j = low;
		int i = low - 1;

		while (j != p) {
			if (arr[j] < arr[p]) {
				i++;
//				 Swap arr[j], arr[i]
				int tmp = arr[j];
				arr[j] = arr[i];
				arr[i] = tmp;
			}
			j++;
		}
		i++;
//		    Swap arr[j], arr[i]
		int tmp = arr[j];
		arr[j] = arr[i];
		arr[i] = tmp;

		return i;
	}

	public void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ,");
		}
		System.out.println();
	}
}
