// sum of outer elements:
package Array2D;

public class Q3 {

	public static void main(String[] args) {
		int twoarr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int i, j, n = twoarr.length, sum = 0;
		for (i = 0; i < twoarr.length; i++) {
			for (j = 0; j < twoarr[i].length; j++) {
				if ((i == 0) || (j == 0) || (i == n - 1) || (j == n - 1))
					sum = sum + twoarr[i][j];

			}
		}
		System.out.println(sum);

	}

}
