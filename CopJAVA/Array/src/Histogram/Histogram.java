package Histogram;

import java.util.Scanner;

public class Histogram {

	public static void main(String[] args) {

		int[] arr = new int[5];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 no = ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		print_histogram(arr);
		find_no(arr);

	}

	public static void print_histogram(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			histogram(arr[i]);

		}
	}

	public static void histogram(int x) {
		System.out.print(x + " = ");
		for (int i = 0; i < x; i++) {
			System.out.print('*');
		}
		System.out.println();
	}

	public static void find_no(int[] arr) {
		int smallNo = arr[0], largeNo = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largeNo) {
				largeNo = arr[i];

			} else if (arr[i] <= smallNo) {
				smallNo = arr[i];
			}

			else {
				System.out.println("INVALID");
			}

		}
		System.out.println("Largest No = " + largeNo);
		System.out.println("Smallest No = " + smallNo);
	}
}
