package NumberPattern;

public class Q16 {

	public static void main(String[] args) {
		int x;
		int y;
		int n = 5;

		for (int i = 1; i <= n; i++) {
			x = i;
			y = n - i + 1;
			for (int j = 1; j <= n; j++) {
				if (j % 2 == 1) {
					System.out.printf("%3d", x);
				} else {
					System.out.printf("%3d", y);
				}
				x += n;
				y += n;

			}
			System.out.println();

		}

	}
}


//1 10 11 20 21
//2  9 12 19 22
//3  8 13 18 23
//4  7 14 17 24
//5  6 15 16 25