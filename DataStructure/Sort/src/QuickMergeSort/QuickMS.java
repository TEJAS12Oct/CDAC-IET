package QuickMergeSort;

public class QuickMS {

	public static void QuickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pi = Partition(arr, low, high);

			QuickSort(arr, low, pi - 1);
			QuickSort(arr, pi + 1, high);
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

	public static void MergeSort(int[] arr, int[] brr, int[] crr) {
		int i = 0, j = 0, k = 0;
		while (i < arr.length && j < brr.length) {
			if (arr[i] <= brr[j]) {
				crr[k] = arr[i];
				k++;
				i++;
			} else {
				crr[k] = brr[j];
				k++;
				j++;
			}
		}
		if (i == arr.length) {
			while (j < brr.length) {
				crr[k] = brr[j];
				j++;
				k++;
			}
		} else {
			while (i < arr.length) {
				crr[k] = arr[i];
				k++;
				i++;
			}
		}
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ,");
		}
		System.out.println();
	}

}
