package StarPattern;

public class Q9 {

	public static void main(String[] args) {
		for (int i = 5; i > 0; i--) {
			System.out.print("!");
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("!");
		}
		System.out.println("!!");
	}
}
