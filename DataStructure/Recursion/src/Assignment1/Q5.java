package Assignment1;

public class Q5 {

	public static void main(String[] args) {

		int N = 2;
		fun(N, 1);
	}

	public static void fun(int N, int i) {

		if (i <= 10) {

			System.out.println(N + " * " + i + " = " + N * i);

			fun(N, ++i);
		}
	}

}
