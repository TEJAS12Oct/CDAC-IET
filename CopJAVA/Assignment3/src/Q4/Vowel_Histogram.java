//4. Write a menu driven Java program to print histogram of vowels for an user input string.

package Q4;

import java.util.Scanner;

public class Vowel_Histogram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  String Name : ");
		String name = sc.nextLine();
		int i = 0;

		int a = 0, e = 0, ii = 0, o = 0, u = 0;
		for (i = 0; i < name.length(); i++) {
			if ((name.charAt(i) == 'A') || name.charAt(i) == 'a') {
				a++;
			}

			if ((name.charAt(i) == 'E') || name.charAt(i) == 'e') {
				e++;
			}

			if ((name.charAt(i) == 'I') || name.charAt(i) == 'i') {
				ii++;
			}

			if ((name.charAt(i) == 'O') || name.charAt(i) == 'o') {
				o++;
			}

			if ((name.charAt(i) == 'U') || name.charAt(i) == 'u') {
				u++;
			}

		}
		int choice;
		do {

			System.out.println("1.A");
			System.out.println("2.E");
			System.out.println("3.I");
			System.out.println("4.O");
			System.out.println("5.u");
			System.out.println("6.Exits");
			System.out.println("Enter the Choice = ");
			choice = sc.nextInt();
			//choice = name.charAt(i);

			switch (choice) {
			case 1: {
				print_histogram(a, 'a');

				break;
			}

			case 2: {
				print_histogram(e, 'e');

				break;
			}
			case 3: {
				print_histogram(ii, 'i');
				break;
			}

			case 4: {
				print_histogram(o, 'o');
				break;
			}
			case 5: {
				print_histogram(u, 'u');
				break;
			}
			default: {
				System.out.println("Invalid Choice  Enter Choice (1-5)");
			}
			}

		} while (choice != 6);
		sc.close();

	}

	public static void print_histogram(int n, char T) {
		System.out.print(T + ":");
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
