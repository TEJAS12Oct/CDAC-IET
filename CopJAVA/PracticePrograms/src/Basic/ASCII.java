package Basic;

public class ASCII {

	public static void main(String[] args) {

		int ch1 = 'a';
		int ch2 = 'b';
		System.out.println("The ASCII value of a is: " + ch1);
		System.out.println("The ASCII value of b is: " + ch2);

		System.out.println();

		char ch3 = 'c';
		char ch4 = 'd';
		// variable that stores the integer value of the character
		int asciivalue1 = ch3;
		int asciivalue2 = ch4;
		System.out.println("The ASCII value of " + ch3 + " is: " + asciivalue1);
		System.out.println("The ASCII value of " + ch4 + " is: " + asciivalue2);

		System.out.println();

		char ch5 = 'e';
		char ch6 = 'f';
		// casting or converting a charter into int type
		int ascii1 = (int) ch5;
		int ascii2 = (int) ch6;
		System.out.println("The ASCII value of " + ch5 + " is: " + ascii1);
		System.out.println("The ASCII value of " + ch6 + " is: " + ascii2);

	}

}
