package Assignment1;

import java.util.Scanner;

public class Fibonaci {
	public static void main(String args[]) {
		int n, c = 0, i;
		System.out.println(" Enter the number of elements to be printed");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Fibonacci series is : ");
		for (i = 1; i <= n; i++) {
			System.out.print(" " + fibonacci(c));
			c++;
		}
	}

	private static int fibonacci(int c) {
		if (c == 0)
			return 0;
		else if (c == 1)
			return 1;
		else
			return (fibonacci(c - 1) + fibonacci(c - 2));
	}
}
