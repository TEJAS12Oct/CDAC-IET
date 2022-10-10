package Array;

public class SmallestNo {

	public static void main(String[] args) {
		int arr[] = new int[] { 10, 12, 13, 98, 74, 25, 63, 41, 1 };
		System.out.println("Original Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.print("Small No : " + min);

	}

}
