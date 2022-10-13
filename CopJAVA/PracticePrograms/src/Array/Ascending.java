package Array;

public class Ascending {

	public static void main(String[] args) {
		int arr[] = new int[] { 10, 12, 13, 98, 74, 25, 63, 41, 1 };
		System.out.println("Original Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println();
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		System.out.println("Ascending Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("3rd Largest Element : " + arr[arr.length - 3]);
		System.out.println("3rd Smallest Element : " + arr[2]);
	}

}
