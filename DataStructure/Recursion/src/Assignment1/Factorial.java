package Assignment1;

public class Factorial {

	public static void main(String args[]) {
		int i, f;
		int number = 5;
		f = fact(number);
		System.out.println("Factorial of " + number + " is: " + f);
	}

	public static int fact(int n) {
		if (n == 0) {
			return 1;
		}
		int factNm1 = fact(n - 1);
		int factN = factNm1 * n;
		return factN;
	}

}
