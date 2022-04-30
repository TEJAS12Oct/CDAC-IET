package POG;

public class Anagram_1 {

	public static void main(String[] args) {
		String S1 = "Tejas";
		String S2 = "sajeT";
		int arr[] = new int[128];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}
		if (S1.length() != S2.length()) {
			System.out.println("String are not Anagram");
		} else {
			for (int i = 0; i < S1.length(); i++) {
				arr[(int) S1.charAt(i)]++;
			}
			for (int i = 0; i < S2.length(); i++) {
				arr[(int) S2.charAt(i)]--;
			}

			boolean Flag = false;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != 0) {
					Flag = true;
					break;
				}
			}
			if (Flag == true) {
				System.out.println("String are not Anagram");
			} else {
				System.out.println("String are Anagram ");
			}
		}
	}

}
