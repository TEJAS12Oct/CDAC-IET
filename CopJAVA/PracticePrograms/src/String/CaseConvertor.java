package String;

public class CaseConvertor {

	public static void main(String[] args) {
		String S = "TEJAS satish JaWaLe";
		String S1 = S.toLowerCase();
		String S2 = S.toUpperCase();
		System.out.println(S1);
		System.out.println(S2);

		StringBuffer newStr = new StringBuffer(S);

		for (int i = 0; i < S.length(); i++) {
			if (Character.isLowerCase(S.charAt(i))) {
				newStr.setCharAt(i, Character.toUpperCase(S.charAt(i)));
			} else if (Character.isUpperCase(S.charAt(i))) {
				newStr.setCharAt(i, Character.toLowerCase(S.charAt(i)));
			}
		}
		System.out.println("String after case conversion : " + newStr);

	}

}
