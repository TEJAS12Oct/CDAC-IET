package NumberPattern;

public class Q20 {

	public static void main(String[] args) {
		int i, j;
		for (i = 5; i >= 1; i--) {
			for (j = 5; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
		System.out.println();
		System.out.println();

		int k = 1;
		for (i = 4; i >= 1; i--) {
			for (j = 4; j >= i; j--) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println(" ");
		}
		System.out.println();
		System.out.println();

	}

}
