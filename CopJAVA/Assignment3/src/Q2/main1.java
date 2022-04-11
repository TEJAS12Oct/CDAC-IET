/*2. Update previous program to add Subtraction and Division function in
MathOperation class. Also update main class to take 2 numbers from
command line and ask user which option to perfrom (Menu driven)
*/

package Q2;

import java.util.Scanner;

public class main1 {

	public static void main(String[] args) {

		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);

		Number1 num1 = new Number1(n1);
		Number1 num2 = new Number1(n2);

		System.out.println(n1);
		System.out.println(n2);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Choice = ");
		int choice;
		do {
			choice = sc.nextInt();
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Exits");

			switch (choice) {
			case 1: {
				Number1 n3 = MathOperation1.addition(num1, num2);
				System.out.println("Addition of " + n1 + " and " + n2 + " is : " + n3);
				break;
			}

			case 2: {
				Number1 n5 = MathOperation1.subtraction(num1, num2);
				System.out.println("Subtraction of " + n1 + " and " + n2 + " is : " + n5);
				break;
			}
			case 3: {
				Number1 n4 = MathOperation1.multiply(num1, num2);
				System.out.println("Multiplication of " + n1 + " and " + n2 + " is : " + n4);
				break;
			}
			case 4: {
				Number1 n6 = MathOperation1.division(num1, num2);
				System.out.println("Division of " + n1 + " and " + n2 + " is : " + n6);
				break;
			}
			default: {
				System.out.println("Invalid Choice  Enter Choice (1-4)");
			}
			}

		} while (choice != 5);
		{
			System.out.println("End");
		}

	}
}
