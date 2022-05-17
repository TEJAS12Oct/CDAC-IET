package Q3;

public class Pattern {

	public static void main(String[] args) {
		for (int i = 5; i >= 1; i--) {
			for (int j = i; j <= 5; j++)
				System.out.print(j);
			for (int k = 4; k >= i; k--)
				System.out.print(k);
			System.out.println();
		}

	}

}
