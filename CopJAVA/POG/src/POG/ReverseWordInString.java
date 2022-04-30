package POG;

public class ReverseWordInString {

	public static void reverse(char str[], int start, int end) // partial array
	{
		char temp;
		while (start <= end) {
			temp = str[start];
			str[start] = str[end];
			str[end] = temp;
			start++;
			end--;
		}

	}

	public static void reverseWord(char str[], int start, int end) // This Is Demo Class
	{
		int wStart, wEnd;
		for (wStart = wEnd = start; wEnd < end; wEnd++) {
			if (str[wEnd] == ' ') {
				continue; // next new word transfer
			}
			wStart = wEnd;
			while (str[wEnd] != ' ' && wEnd < end) // "this is demo class"
			{
				wEnd++;
			}
			if (wEnd != end) {
				wEnd--;
			}
			reverse(str, wStart, wEnd);
		}
	}

	public static void main(String[] args) {

		String s = "This Is Demo Class";
		char[] ch = new char[s.length()];
		for (int i = 0; i < ch.length; i++) {
			ch[i] = s.charAt(i);
		}
		System.out.println(ch);
		reverse(ch, 0, ch.length - 1);
		reverseWord(ch, 0, ch.length - 1);
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}

	}
}
