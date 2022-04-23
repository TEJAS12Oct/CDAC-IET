package study.Strings;

import java.util.Scanner;
public class Example2 {

	public static void main(String[] args) {

		String S1 = "tejas";
		String UpperString = S1.toUpperCase();
		System.out.println(S1 + " <= Convert UpperCase=> " + UpperString + "\n");

		String S2 = "TEJAS";
		String LowerString = S2.toLowerCase();
		System.out.println(S2 + " <= Convert LowerCase => " + LowerString + "\n");

		String C1 = "Tejas";
		String C2 = " Jawale";
		String C3 = C1.concat(C2);
		System.out.println(C3 + "\n");
// In Constant pool Value are Not Added,
// Hence They Create New object every time When We concat String ,
// Adding 2 literals in That Object

// Literals = Constant Pool ==> Collection of String literals
		String St1 = "Numbers Are = "; 
		for (int i = 0; i < 10; i++) { // 10 Object Created
			St1 = St1.concat(" " + i);
		}
		System.out.println(St1+ "\n");
		
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Name in LowerCase : ");
		String Name = Sc.next();
		String UpperConvert = Name.toUpperCase();
		System.out.println("Uppercase Convert = > " + UpperConvert + "\n");
		
		System.out.println("Enter Name in Uppercase : ");
		String Name2  = Sc.next();
		String LowerConvert = Name2.toLowerCase(); 
		System.out.println("Lppercase Convert = > " + LowerConvert );
		
	}

}
