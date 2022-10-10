package String;

public class VowelConsonants {

	public static void main(String[] args) {
		String s = "Tejas Jawale AEOU";
		int Vcount = 0;
		int Ccount = 0;
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I'
					|| s.charAt(i) == 'O' || s.charAt(i) == 'U') {
				Vcount++;
			} else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				Ccount++;
			}
		}
		System.out.println("Vowels Count : " + Vcount);
		System.out.println("Consonants Count : " + Ccount);

	}

}
