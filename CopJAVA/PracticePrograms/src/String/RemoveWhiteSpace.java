package String;

public class RemoveWhiteSpace {
	public static void main(String[] args) {
		String S = "Tejas Satish Jawale";

		S = S.replaceAll("\\s+", "");
		System.out.println(S);

		String S1 = "Tejas Satish Jawale";
		char ch = '-';
		String S2 = S1.replace(' ', ch);
		System.out.println(S2);
	}

}
