package Assignment1;

public class Q4 {

	public static void main(String[] args) {

		int i = 6;
		fun(i);
		fun1(0);
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

	private static void fun1(int x) {

		if (x < 4) {

			x = x + 1;
			fun1(x);

			for (int p = 0; p < x; p++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

}
