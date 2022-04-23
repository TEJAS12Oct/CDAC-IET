package InsertionSort;

public class Sort {

	public void InsertionAscending(int[] arr) {
		int i, j;
		for (j = 1; j < arr.length; j++) {
			i = j;

			while (i > 0) {
				if (arr[i] < arr[i - 1]) {
					// swap(arr[i], arr[i - 1]);
					int tmp = arr[i];
					arr[i] = arr[i - 1];
					arr[i - 1] = tmp;
					i--;
				} else
					break;
			}
		}

	}
	
	public void InsertionDecending(int[] arr) {
		int i, j;
		for (j = 1; j < arr.length; j++) {
			i = j;

			while (i > 0) {
				if (arr[i] > arr[i - 1]) {
					// swap(arr[i], arr[i - 1]);
					int tmp = arr[i];
					arr[i] = arr[i - 1];
					arr[i - 1] = tmp;
					i--;
				} else
					break;
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
