package Merge2Array;

public class MergeArr {

	public static void Merge(int[] arr, int[] brr, int[] crr) {
		int i = 0, j = 0, k = 0;
		while (i < arr.length && j < brr.length) {
			if (arr[i] <= brr[j]) {
				crr[k] = arr[i];
				i++;
				k++;
			} else {
				crr[k] = brr[j];
				j++;
				k++;
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
				i++;
				k++;
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
