package Assignment1;

public class StringPalindrome {

	public static void main(java.lang.String[] args) {

		String str = "WOW";
		String rev = "";

		System.out.println(str.length());

		for (int i = str.length() - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);
		}
		System.out.println("rev = " + rev);

		if (str.equals(rev)) {

			System.out.println(rev + "  is palindrome");
		}

	}

}
