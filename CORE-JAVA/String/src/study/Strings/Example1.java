package study.Strings;

public class Example1 {

	public static void main(String[] args) {

		String S1 = "Hello"; // literals
		String S2 = "Hello"; // literals
		String S3 = new String("Hello"); // does not go in constant pool because of new KW

// Use == to compare the address in the string reference
// Literals Are Same, they Pointing Object S2 , Address Is Same(S1 & S2)		
		if (S1 == S2)
			System.out.println("Both S1 and S2 point to be Same Object");
		else
			System.out.println("Both S1 and S2 point to be Different Object");

// S1 is Literals , S3 Is object , both are Different And Address Also Different
		if (S1 == S3)
			System.out.println("Both S1 and S3 point to be Same Object");
		else
			System.out.println("Both S1 and S3 point to be Different Object");

	}

}
