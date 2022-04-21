package study.Wrapper;

import java.util.Scanner;

public class PasswordSettingUtility {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		do {

			System.out.println("Enter Password");
			System.out.println("1.At least one Uppercase");
			System.out.println("2.At least one number");
			System.out.println("3.The first character should be a letter");
			String Password = sc.next();

			int UpperCnt = 0;
			int DigitCnt = 0;
			int FirstLetterCnt = 0;

			for (int i = 0; i < Password.length(); i++) {
				char ch = Password.charAt(i);
				if (Character.isUpperCase(ch)) {
					UpperCnt++;
				}
				if (Character.isDigit(ch)) {
					DigitCnt++;
				}
				if (Character.isLetter(ch)) {
					FirstLetterCnt++;
				}
			}

			if (UpperCnt > 0 && DigitCnt > 0 && FirstLetterCnt > 0) {
				System.out.println("Password Is Strong !!!\n");
				break;
			} else {
				System.out.println("Enter Password IS Not Strong....\n");
			}
			

		} while (true);
	}

}
