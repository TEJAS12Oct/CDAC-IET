/*
Q1)Given sorted Array and a number X , find the pair in array whose sum is closest 
	to X
	Input arr[] = {1,3,4,7,10,12}
	outpur : 3 & 12 
	
*/

package Array1D;

public class Q1 {

	public static void main(String[] args) {

		int i, j, resi = 0, resj = 1, sum, diff;
		int[] arr = { 1, 3, 4, 7, 10, 12 };
		int X = 15;
		sum = arr[0] + arr[1];
		// sum=4
		diff = Math.abs(sum - X);
		// diff=11
		for (i = 0; i < arr.length - 1; i++) {
			for (j = i + 1; j < arr.length; j++) {
				sum = arr[i] + arr[j];
				if ((Math.abs(sum - X)) < diff) {
					resi = i;
					resj = j;
					diff = Math.abs(sum - X);
				}
			}
		}
		System.out.println(arr[resi] + " and " + arr[resj]);
	}// Mend of main
} // end of clas
