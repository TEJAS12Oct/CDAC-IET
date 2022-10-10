package Array;

public class RightShift {

	public static void main(String[] args) {
		int arr[] = new int[] { 21, 22, 23, 24, 25 };

		System.out.println("Origianl Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int n = 2;
		int j, last;

		for (int i = 0; i < n; i++) {
			last = arr[arr.length - 1];
			for (j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[j] = last;
		}

		System.out.println("Right Shift :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
