package Q4;

import java.util.Scanner;

public class SumItUp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Comma Seprated No = ");
		String S = sc.next();
		String[] No = S.split(",");
		int sum = 0;
		for (String Num : No) {
			System.out.print(Num + " ");
			sum = sum + Integer.parseInt(Num);

		}
		System.out.println("\nSum = "+sum);
	}
}
