package StackMD;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int choice, N;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Size of  = ");

		int size = sc.nextInt();

		Stack s1 = new Stack(size);
		

		do {
			System.out.println("1.PUSH");
			System.out.println("2.POP");
			System.out.println("3.PRINT");
			System.out.println("4.EXIT");
			System.out.println("ENTER YOUR CHOICE");
			choice = sc.nextInt();

			switch (choice) {

			case 1: {
				System.out.println("ENTER ELEMENT");
				N = sc.nextInt();
				s1.push(N);

				break;
			}

			case 2: {
				
				s1.pop();
				break;
			}

			case 3: {
				System.out.println(s1);
				//s1.print();
				break;
			}

			default: {
				System.out.println("Invalid");
			}

			}

		} while (choice != 4);
	}

}
