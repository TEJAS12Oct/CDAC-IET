package study;

import java.util.Scanner;

public class DelimiterExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name = ");
		sc.hasNext();     // delimiter is so space is not included
		String S = sc.nextLine();  // delimiter is new line so it include spaces
		System.out.println(S);

		System.out.println("Enter Your Name = ");
		String S1 = sc.next();
		System.out.println(S1);
		
		sc.close();
	}

}
