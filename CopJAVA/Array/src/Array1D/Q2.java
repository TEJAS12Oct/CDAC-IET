// Q2) LArgest and Second Largest no. from Array
package Array1D;

public class Q2 {

	public static void main(String[] args) {

		int i, arr[] = { 12, 34, 50, 55, 43, 54, 60, 10, 9, 51 };
		int max = Integer.MIN_VALUE, smax = Integer.MIN_VALUE;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				smax = max;
				max = arr[i];
			} else if (arr[i] > smax) {
				smax = arr[i];
			}
		}
		System.out.println("Largest = " + max + " \nSecond largest =" + smax);
	}// end of main
}// end of class
