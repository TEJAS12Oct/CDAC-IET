package Array;

public class LeftShift {

	public static void main(String[] args) {
		int arr[] = new int[] { 21, 22, 23, 24, 25 };

		System.out.println("Original Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		int n = 2;
		int j, first;
		for (int i = 0; i < n; i++) {
			first = arr[0];
			for (j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[j] = first;
		}
		System.out.println("Left Shift : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
