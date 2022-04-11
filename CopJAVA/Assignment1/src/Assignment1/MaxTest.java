/*
Create MaxTest Java class to overload max() function to calculate maximum of 
two numbers and maximum of three numbers 
*/
package Assignment1;

public class MaxTest {

	void max(int n1, int n2) {
		if (n1 > n2) {
			System.out.println("n1 = " + n1 + "  n2 = " + n2 + "   max = " + n1);
		} else {
			System.out.println("n1 = " + n1 + "  n2 = " + n2 + "   max = " + n2);
		}
	}

	void max(int n1, int n2, int n3) {
		if (n1 > n2) {
			System.out.println("n1 = " + n1 + "  n2 = " + n2 + "   max = " + n1);
		} else if (n2 > n3) {
			System.out.println("n1 = " + n1 + "  n2 = " + n2 + "   max = " + n2);
		} else {
			System.out.println("n1 = " + n1 + "  n2 = " + n2 + "  n3 = " + n3 + "   max = " + n3);
		}

	}

	public static void main(String[] args) {
		MaxTest M = new MaxTest();

		M.max(2, 4);
		M.max(1, 2, 3);

	}

}
