// Display Element

package Array2D;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		int i, j, n, m;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter number of rows :");
		n = sc.nextInt();
		int twoarr[][] = new int[n][];
		for (i = 0; i < twoarr.length; i++) {
			System.out.println("\n Enter number of col for " + i + "th row");
			m = sc.nextInt();
			twoarr[i] = new int[m];
		}

		for (i = 0; i < twoarr.length; i++) {
			for (j = 0; j < twoarr[i].length; j++) {
				twoarr[i][j] = i + j;
			}
		}
		display_twoarr(twoarr);
	}

	static void display_twoarr(int[][] two) {
		int i, j;
		for (i = 0; i < two.length; i++) {
			for (j = 0; j < two[i].length; j++) {
				System.out.println(two[i][j]);
			}
			System.out.println("\n");

		}
	}

}
