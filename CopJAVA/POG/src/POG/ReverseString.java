package POG;

public class ReverseString {

	public static void main(String[] args) {
		String S = "This  Is Demo Class";
		int endIndex = S.length() - 1;
		int i = endIndex;
		do {
			i--;
			if (S.charAt(i) == ' ' || i == 0) {
				System.out.print(S.substring(i, endIndex + 1));
				endIndex = i - 1;
			}
		} while (i > 0);
	}

}
