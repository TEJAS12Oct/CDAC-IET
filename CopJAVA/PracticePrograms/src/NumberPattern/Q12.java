package NumberPattern;

public class Q12 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				System.out.printf("%3d", ((i + j) - 1));

			}
			System.out.println();

		}
	}

}

//1  2  3  4  5
//2  3  4  5  6
//3  4  5  6  7
//4  5  6  7  8
//5  6  7  8  9