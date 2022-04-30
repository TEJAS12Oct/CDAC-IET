package POG;

import java.util.*;

public class PascalTriangle {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);

		System.out.println("Enter Size : ");
		int Size = Sc.nextInt();

		int arr[][] = new int[Size][Size];

		triangle(arr);
		Display(arr);

	}

	private static void triangle(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <= i; j++) {
				if ((j == 0) || (i == j))
					arr[i][j] = 1;
				else
					arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
			}
		}
	}

	private static void Display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
