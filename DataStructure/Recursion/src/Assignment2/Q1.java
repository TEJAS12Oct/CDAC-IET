// Function to display and find out the sum of series
// Series : 1 + 2 + 3 + 4 + 5 +....... 

package Assignment2;

public class Q1 {

	public static void main(String[] args) {

		int add = sum(0);
		System.out.println("\nsum = " + add);

	}

	public static int sum(int i) {

		if (i < 4) {
			for (i = 1; i <= 4; i++) {
				System.out.print(i + " ");

			}
			i = i + i++;
			sum(i);

		}
		return i;

	}

}
