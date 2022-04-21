package study.basics.math;

import java.util.Scanner;

public class calculator {
	static int num1, num2, res, result;
	char Operator;

	public static int calculate(int num1, int num2, char Operator) {

		switch (Operator) {
		case '+': {
			System.out.println("Addition ");
			int res = num1 + num2;
			return res;
		}
		case '-': {
			System.out.println("Substraction");
			int res = num1 - num2;
			return res;

		}
		case '*': {
			System.out.println("Multiplication");
			int res = num1 * num2;
			return res;
		}
		case '/': {
			System.out.println("Division");
			int res = num1 / num2;
			return res;
		}

		}

		return -999;
	}

}