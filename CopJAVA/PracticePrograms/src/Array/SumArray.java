package Array;

public class SumArray {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5 };
		System.out.println("Original Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum  : " + sum);
	}

}
