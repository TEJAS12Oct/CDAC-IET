package study.DataTypes;

import java.util.Scanner;

public class DataTypes {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		TestByte();
		TestShort();
		TestInt();
		TestLong();
		TestFloat();
		TestDouble();
		TestChar();
		TestBoolean();

	} // ENd of Main

	public static void TestByte() {
		byte B1 = 127; // Range = -128 to 127 // size = 1 bytes ,8 =bits  2^8=256 /2
//		byte B2= 200;  // Error Because value is out of range

		System.out.println("Enter a Byte Value = ");
		byte b = sc.nextByte();
		System.out.println("You Enter Value = " + b);
	}

	public static void TestShort() {  // 2 = 16   2^16  = -32768 to 32767
		short S1 = 200; // Range = -32758 to 32767
//		short S2 = 1000000;  // Error Because value is out of range

		System.out.println("Enter a Short Value = ");
		short s = sc.nextShort();
		System.out.println("You Enter Value = " + s);
	}

	public static void TestInt() {
//      Range = -2147483648  to 2147483647
		int I1 = 12;
		System.out.println("Enter a Int Value = ");
		int I = sc.nextInt();
		System.out.println("You Enter Value = " + I);
	}

	public static void TestLong() {
//      Range  = -2^63  to 2^63 -1	
		long L1 = 123;
		long L2 = 1233333345999999998L;
		System.out.println("Enter a Long Value = ");
		long L = sc.nextLong();
		System.out.println("You Enter Value = " + L);
	}

	public static void TestFloat() {
		float F1 = 34.5f;
//      Range  =  
		System.out.println("Enter a Float Value = ");
		float F = sc.nextFloat();
		System.out.println("You Enter Value = " + F);
	}

	public static void TestDouble() {

		System.out.println("Enter a Double Value = ");
		double D = sc.nextDouble();
		System.out.println("You Enter Value = " + D);
	}

	public static void TestChar() {
		char C = 'T';
		System.out.println("Enter a Char  = ");

//  	String s = sc.next();
//		char Ch =  s.charAt(0);

		char ch = sc.next().charAt(0);
		System.out.println("You Enter Character = " + ch);
	}

	public static void TestBoolean() {
//      boolean Flag1 = 0;   // Not Applicable		
		boolean flag = true;
		System.out.println("Enter Boolean = ");
		boolean BL = sc.nextBoolean();
		System.out.println("You Enter  Boolean  = " + BL);
	}

} // End of Class
