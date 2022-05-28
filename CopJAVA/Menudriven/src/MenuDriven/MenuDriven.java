/* 
write a menu driven  program for display of following menu
  1.addition
  2.subtraction
  3.multiplication
  4.division
  5.sum of digits
  6.reverse of number
  7.exit
  Enter your Choice (1-7)
write appropriate function and call those function based on user's choice
*/

package MenuDriven;

import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args) {
		int ch, num1=0, num2=0, res;
		Scanner sc = new Scanner(System.in);
		do {

			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Sum of digits");
			System.out.println("6.Reverse of number");
			System.out.println("7.Exit");
			System.out.println("Enter your choice (1-7) = ");
		
			ch = sc.nextInt();
			
			if (ch == 7)
				return;
			if ((ch >= 1) && (ch <= 4)) {
				System.out.println("\nEnter the 2 no =  ");
				num1 = sc.nextInt();
				num2 = sc.nextInt();

			}
			if ((ch >= 5) && (ch <= 6)) {
				System.out.println("\nEnter the 1 no =  ");
				num1 = sc.nextInt();
			}

			switch (ch) {
			case 1: {
				res = addition(num1, num2);
				System.out.println("Addition  of " + num1 + "  and " + num2 + "  =  " + res);
				break;
			}
			case 2: {
				res = subtraction(num1, num2);
				System.out.println("Subtraction  of " + num1 + "  and " + num2 + "  =  " + res);
				break;
			}
			case 3: {
				res = multiplication(num1, num2);
				System.out.println("Multiplication  of " + num1 + "  and " + num2 + "  =  " + res);
				break;
			}
			case 4: {
				res = division(num1, num2);
				System.out.println("Division  of " + num1 + "  and " + num2 + "  =  " + res);
				break;
			}

			case 5: {
				res = sum_of_digits(num1);
				System.out.println("sum_of_digits  of " + num1 + "  =  " + res);
				break;
			}

			case 6: {
				res = reverse(num1);
				System.out.println("reverse  of " + num1 + "  =  " + res);
				break;
			}

			default: {
				System.out.println("Invalid Choice  Enter Choice (1-7)");
			}

			}

		} while (ch != 7);
		System.out.println("Bye Bye");

	}

	static int addition(int num1, int num2) {
		return num1 + num2;
	}

	static int subtraction(int num1, int num2) {
		return num1 - num2;
	}

	static int multiplication(int num1, int num2) {
		return num1 * num2;
	}

	static int division(int num1, int num2) {
		return num1 / num2;
	}

	static int reverse(int num) {
		int rem, rev_num = 0;
		while (num > 0) {
			rem = num % 10;
			rev_num = rev_num * 10 + rem;
			num = num / 10;
		}
		return rev_num;
	}

	static int sum_of_digits(int num) {
		int rem, sum = 0;
		while (num > 0) {
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		return sum;
	}

}
