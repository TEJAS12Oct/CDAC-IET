package Assignment1;

public class Q2 {

	public static void main(String[] args) {
		int i = 6;
		fun(i);
	}

	private static void fun(int x) {

		if (x > 0) {

			x = x - 1;
			fun(x);

			for (int p = 0; p < x; p++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
