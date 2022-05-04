package study.Wrapper;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {

		System.out.println("Byte value range is " + Byte.MIN_VALUE + " TO " + Byte.MAX_VALUE);

		System.out.println("Long value range is " + Long.MIN_VALUE + " TO " + Long.MAX_VALUE);

		System.out.println("Int value range is " + Integer.MIN_VALUE + " TO " + Integer.MAX_VALUE);

		System.out.println("Short value range is " + Short.MIN_VALUE + " TO " + Short.MAX_VALUE);

		String S = "23.56";
		// Extract the Double value from the String
		double sum = Double.parseDouble(S) + 3.2;  // parseDouble => String Convert Into Double 
		System.out.println("Sum = " + sum);

		String S1 = "true";
		boolean BL = Boolean.parseBoolean(S1);
		if (BL) // Solve this using utility method parseBoolean from boolean wrapper class
			System.out.println("BL =  " + "Hi");
		if (Boolean.parseBoolean(S1))
			System.out.println("Boolean.parseBoolean =  " + "Hi");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name = ");
		String S2 = sc.next();
		
//		String S2 = "TeJas JaWaLe";
//		Print All UpperCase Character
		System.out.print("UpperCase Letter = ");
		for (int i = 0; i < S2.length(); i++) {
			char ch = S2.charAt(i);
			if (Character.isUpperCase(ch))
				System.out.print(ch);
		}
	}

}
