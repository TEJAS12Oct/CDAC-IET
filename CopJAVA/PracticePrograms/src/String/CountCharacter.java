package String;

public class CountCharacter {

	public static void main(String[] args) {
		String S = "Tejas Jawale";
		int c = 0, i = 0;
		for (i = 0; i < S.length(); i++) {
			if (S.charAt(i) != ' ') {
				c++;
			}
		}
		System.out.println("Total Character Count : " + c);
		System.out.println("String Length :" + S.length());

		System.out.println("------------------------------------------------");

		int d = 0;
		for (i = 0; i < S.length(); i++) {
			if (S.charAt(i) == ' ') {
				d++;

			}
		}
		System.out.println("Blank Space Count : " + d);

	}

}
