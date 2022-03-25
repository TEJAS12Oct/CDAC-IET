/*
 2D Array
syntax:

 int arr[][];  or  int [][]arr;

 with memory allocation

 int arr[][] = new int[][3] //error

 int arr[][]=new int[3][];

*/

package Array;

public class arr {

	public static void main(String[] args) {
		int arr[][] = new int[3][6];

		int i, j;
		for (i = 0; i < arr.length; i++) {
			System.out.println("arr[i] =  " +i);
			for (j = 0; j < arr.length; j++) {
				arr[i][j] = i + j;
				System.out.println("arr[i][j] = " + arr[i][j]);

			}
			System.out.println("\n");

		}
	}
}