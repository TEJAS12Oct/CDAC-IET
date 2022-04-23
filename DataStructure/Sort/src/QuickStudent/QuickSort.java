package QuickStudent;

public class QuickSort {

	public void QuickS(Student[] arr, int low, int high) {
		if (low < high) {
			int pi = PartitionAge(arr, low, high);

			QuickS(arr, low, pi - 1);
			QuickS(arr, pi + 1, high);
		}
	}

	public void QSort(Student[] arr, int low, int high) {
		if (low < high) {

			int pivot = PartitionMarks(arr, low, high);

			QSort(arr, low, pivot - 1);
			QSort(arr, pivot + 1, high);
		}
	}

	private int PartitionAge(Student[] arr, int low, int high) {
		int p = high;
		int j = low;
		int i = low - 1;

		while (j != p) {

			if (arr[j].getAge() < arr[p].getAge()) {
				i++;
//				 Swap arr[j], arr[i]
				Student tmp = arr[j];
				arr[j] = arr[i];
				arr[i] = tmp;
			}
			j++;
		}
		i++;
//		    Swap arr[j], arr[i]
		Student tmp = arr[j];
		arr[j] = arr[i];
		arr[i] = tmp;

		return i;
	}

	private int PartitionMarks(Student[] arr, int l, int h) {
		int p = h;
		int j = l;
		int i = l - 1;

		while (j != p) {
			if (arr[j].getMarks() < arr[p].getMarks()) {

				i++;
//				 Swap arr[j], arr[i]
				Student tmp = arr[j];
				arr[j] = arr[i];
				arr[i] = tmp;
			}
			j++;
		}
		i++;
//		    Swap arr[j], arr[i]
		Student tmp = arr[j];
		arr[j] = arr[i];
		arr[i] = tmp;

		return i;
	}

	public void print(Student[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ,\n");
		}
		System.out.println();
	}

}
