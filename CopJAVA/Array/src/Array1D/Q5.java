// Array reverse
package Array1D;

public class Q5 {

	public static void main(String[] args) {
		int i, j, temp;
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		System.out.println("Original array: ");

		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("\nArray in reverse order: ");
		for (j = arr.length - 1; j >= 0; j--) {
			System.out.print(arr[j] + " ");

		}

	}

}
