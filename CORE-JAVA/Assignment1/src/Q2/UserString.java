package Q2;

import java.util.Scanner;

public class UserString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ch;
		System.out.println("Enter a string ");
		String name = sc.nextLine();
		do {

			System.out
					.println("\n1.show length of string\r\n" + "2.Show substring\r\n" + "3.check Palindrome string\r\n"
							+ "4.Count no of Vowels number of white spaces and number of digits\n" + "5.exit ");

			System.out.println(" Enter ur choice");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				StringOpr.length(name);
				break;

			case 2:
				StringOpr.subString(name);
				break;

			case 3:
				StringOpr.palindrome(name);
				break;

			case 4:
				StringOpr.count(name);
				break;

			default:
				System.out.println("Inavlid Choice");
				break;
			}

		} while (ch != 5);
	}

}
