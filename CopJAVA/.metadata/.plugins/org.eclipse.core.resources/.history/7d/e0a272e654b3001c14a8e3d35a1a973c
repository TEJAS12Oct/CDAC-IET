package CODE;

import java.util.*;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No = ");
		int num = sc.nextInt();
		System.out.println("num = " + num);

		int n = num;
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			sum = sum + rem * rem * rem;
			num = num / 10;
		}

		
		if (n == sum) {
			System.out.println("This number is Armstrong number");
		} else {
			System.out.println("This number is not Armstrong number");
		}
	}

}

// 153 =  1^3 +  5^3 + 3^3