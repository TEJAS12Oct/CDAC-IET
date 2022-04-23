package SelectionSort;

public class Sort {

	public void selectionAscending(int[] arr) {
		int counter = 0;
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
				counter++;
			}
			arr[t] = x;
		}
		System.out.println(counter);
	}
	
	
	public void selectionDecending(int[] arr) {
		//int counter = 0;
		for (int t = 0; t < arr.length - 1; t++) {
			int i = t;
			int x = arr[i];
			while (i < arr.length) {
				if (arr[i] > x) {
					int tmp = arr[i];
					arr[i] = x;
					x = tmp;

				}
				i++;
				//counter++;
			}
			arr[t] = x;
		}
		//System.out.println(counter);
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ,");
		}
		System.out.println();
	}

}
