package Assignment1;

public class Q1 {

	public static void main(String[] args) {

		int i = 1;
		fun(i);
		fun2(4);

	}

	private static void fun(int x) {

		// 1,2,3,4,5

		System.out.print(x + ", ");

		if (x < 5) {
			x = x + 1;
			fun(x);
		}
	}

	private static void fun2(int j) {
		// 4 3 2 1

		System.out.print(j + ", ");

		if (j > 1) {
			j = j - 1;
			fun2(j);
		}

	}

}
