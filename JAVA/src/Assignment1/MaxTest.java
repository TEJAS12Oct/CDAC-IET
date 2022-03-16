/*
Create MaxTest Java class to overload max() function to calculate maximum of 
two numbers and maximum of three numbers 
*/
package Assignment1;

public class MaxTest {
	void add() {

	}

	void max(int a, int b) {
		if (a > b) {
			System.out.println("a = " + a + "  b = " + b + "   max = " + a);
		} else {
			System.out.println("a = " + a + "  b = " + b + "   max = " + b);
		}
	}

	void max(int a, int b, int c) {
		if (a > b) {
			System.out.println("a = " + a + "  b = " + b + "   max = " + a);
		} else if (b > c) {
			System.out.println("b = " + b + "  c = " + c + "   max = " + b);
		} else {
			System.out.println("a = " + a + "  b = " + b + "  c = " + c + "   max = " + c);
		}

	}

	public static void main(String[] args) {
		MaxTest M = new MaxTest();

		M.max(2, 4);
		M.max(1, 2, 3);

	}

}
