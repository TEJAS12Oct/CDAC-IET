package NumberPattern;

public class Q1 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((i + 1) + " ");
			}

			System.out.println();

		}
		System.out.println();
		System.out.println();

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((j + 1) + " ");
			}

			System.out.println();

		}
	}

}
//1 
//2 2 
//3 3 3 
//4 4 4 4 
//5 5 5 5 5 
//
//
//1 
//1 2 
//1 2 3 
//1 2 3 4 
//1 2 3 4 5 
