package study.basics.math_Main;

import java.util.Scanner;

import study.basics.math.calculator;

public class ClacUser {

	public static void main(String[] args) {
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Num1 = ");
			int num1 = sc.nextInt();
			System.out.println("Enter Num2 = ");
			int num2 = sc.nextInt();

			System.out.println("Enter Operator = ");
			char Operator = sc.next().charAt(0);

			if (Operator == '0')
				break;

			int result = calculator.calculate(num1, num2, Operator);
			System.out.println("Result = " + result + "\n");
			System.out.println("0.exit" + " \n");

			
		} while (true);
	}

}
