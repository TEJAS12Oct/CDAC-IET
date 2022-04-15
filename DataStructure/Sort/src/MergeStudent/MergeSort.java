package MergeStudent;

public class MergeSort {

	public static void MSort(Student[] crr, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - (m + 1) + 1; // int n2 = r- m;

		Student[] arr = new Student[n1];
		Student[] brr = new Student[n2];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = crr[l + i];
		}

		for (int i = 0; i < brr.length; i++) {
			brr[i] = crr[m + 1 + i];
		}

		int i = 0, j = 0, k = l;
		while (i < arr.length && j < brr.length) {
			if (arr[i].getAge() <= brr[j].getAge()) {
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

	public static void MergeS(Student[] crr, int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;
			MergeS(crr, l, m);
			MergeS(crr, m + 1, r);

			MSort(crr, l, m, r);

		}
	}

	public static void print(Student[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "");
		}
		System.out.println();
	}

}
