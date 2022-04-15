package MergeSort;

public class MergeSort {

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

	public static void MSort(int[] crr, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - (m + 1) + 1; // int n2 = r- m;

		int[] arr = new int[n1];
		int[] brr = new int[n2];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = crr[l + i];
		}

		for (int i = 0; i < brr.length; i++) {
			brr[i] = crr[m + 1 + i];
		}

		int i = 0, j = 0, k = l;
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

		while (j < brr.length) {
			crr[k] = brr[j];
			j++;
			k++;
		}

		while (i < arr.length) {
			crr[k] = arr[i];
			i++;
			k++;

		}
	}

	public static void MergeS(int[] crr, int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;
			MergeS(crr, l, m);
			MergeS(crr, m + 1, r);

			MSort(crr, l, m, r);

		}
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ,");
		}
		System.out.println();
	}

}
