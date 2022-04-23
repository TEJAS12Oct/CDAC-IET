package CaseConvertor;

import java.util.Scanner;

public class CaseConvertor {

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Name in LowerCase : ");
		String Name = Sc.next();
		String UpperConvert = Name.toUpperCase();
		System.out.println("Uppercase Convert = > " + UpperConvert + "\n");

		System.out.println("Enter Name in Uppercase : ");
		String Name2 = Sc.next();
		String LowerConvert = Name2.toLowerCase();
		System.out.println("Lppercase Convert = > " + LowerConvert);

	}

}
