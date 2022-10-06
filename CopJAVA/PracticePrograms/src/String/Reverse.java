package String;

public class Reverse {
	public static void main(String[] args) {
		String str = "TEJAS";
		String RS = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			RS = RS + str.charAt(i);
		}
		System.out.println(RS);
	}

}
