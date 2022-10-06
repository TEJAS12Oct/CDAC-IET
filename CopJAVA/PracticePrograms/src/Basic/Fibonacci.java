package Basic;

public class Fibonacci {

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		System.out.print(n1 + " " + n2);
		int n3;
		int count = 5;

		for (int i = 0; i < count; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}

	}

}
