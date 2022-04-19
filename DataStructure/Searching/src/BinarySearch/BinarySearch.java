package BinarySearch;

import java.util.Scanner;

public class BinarySearch {
	
	int[] arr;
	int key = 105;

	public BinarySearch(int size) {
		arr = new int[size];
	}

	private int bin_search(int key) {
		int low = 0;
		int high = arr.length - 1;
		int mid = (low + high) / 2;

		while ((arr[mid] != key) && (low <= high)) {

			if (key < arr[mid])
				high = mid - 1;
			else
				low = mid + 1;
			mid = (low + high) / 2;
		}
		if (arr[mid] == key)
			return mid + 1;
		else
			return -1;

	}

	private void accept_array() {
		int i;
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < arr.length; i++) {
			System.out.println("Enter Number = ");
			arr[i] = sc.nextInt();
		}
	}

	public static void main(String[] args) {
		// arr = { 12, 21, 23, 32, 34, 45, 67, 90 };
		BinarySearch obj = new BinarySearch(8);
		obj.accept_array();
		
		int pos = obj.bin_search(90);
		if (pos != 1)
			System.out.println("Found at " + pos + " Position");
		else
			System.out.println("Not Found  .....");
	}

}
