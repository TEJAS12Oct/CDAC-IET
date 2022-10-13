package Array;

public class DuplicateElement {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 1, 2, 3, 4, 5, 5, 6, 6, 7, 7, 8, 8, 95, 95, 84, 84 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
				else {
					System.out.println(arr[i]);
				}
			}
		}
	}

}
