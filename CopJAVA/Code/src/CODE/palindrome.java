package CODE;

import java.util.*;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No = ");
		int num = sc.nextInt();
		System.out.println("num = " + num);
		
		int n = num;
		int rev = 0;
		int rem;

		while (num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}

		if (n == rev) {
			System.out.println("No is palindrome");

		}
		else {
			System.out.println("No  is not palindrome");
		}

	}

}
