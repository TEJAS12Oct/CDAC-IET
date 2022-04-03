package SelectionSort;

public class Sort {

	public void selection(int[] arr) {
		int n = 0;
		for (int t = 0; t < arr.length - 1; t++) {
			int i = t;
			int x = arr[i];
			while (i < arr.length) {
				if (arr[i] < x) {
					int tmp = arr[i];
					arr[i] = x;
					x = tmp;

				}
				i++;
			}
			arr[t] = x;
		}
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ,");
		}
		System.out.println();
	}

}
