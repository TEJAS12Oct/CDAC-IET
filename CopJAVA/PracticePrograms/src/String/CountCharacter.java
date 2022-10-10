package String;

public class CountCharacter {

	public static void main(String[] args) {
		String S = "Tejas Jawale";
		int c = 0;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) != ' ') {
				c++;
			}
		}
		System.out.println("Character Count : " + c);
		System.out.println("String Length :" + S.length());
		System.out.println("------------------------------------------------");

		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == ' ') {
				c++;
			}
		}
		System.out.println("Blank Space Count : " + c);

	}

}
