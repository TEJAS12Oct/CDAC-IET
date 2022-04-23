package study.Strings;

public class Example3 {

	public static void main(String[] args) {
		// StringBuffer is Mutable // Mutable ==> Value Change
		StringBuffer SB1 = new StringBuffer("Hello");
		SB1.append(" World");
		SB1.append(" Nashik");
		System.out.println(SB1);

		// StringBuilder is Mutable
		StringBuilder SBU1 = new StringBuilder("Good");
		SBU1.append(" Morning");
		System.out.println(SBU1);

		// String Is Immutable => dose not change value
		String S1 = new String("Good");
		// S1.concat(" AfterNoon");
		String S2 = S1.concat(" AfterNoon");
		System.out.println(S2);
	}

}
