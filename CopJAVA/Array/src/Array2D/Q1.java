// Display Element

package Array2D;

public class Q1 {

	public static void main(String[] args) {

		{
			int twoarr[][] = new int[3][3];
			int i, j;
			for (i = 0; i < twoarr.length; i++) {
				for (j = 0; j < twoarr[i].length; j++) {
					twoarr[i][j] = i + j;
				}
			}
			display_twoarr(twoarr);
		}
	}

	static void display_twoarr(int[][] two) {
		int i, j;
		for (i = 0; i < two.length; i++) {
			for (j = 0; j < two[i].length; j++) {
				System.out.println(two[i][j]);

			}
		}

	}

}
