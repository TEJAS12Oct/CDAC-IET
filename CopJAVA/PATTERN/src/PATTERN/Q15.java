package PATTERN;

public class Q15 {

	public static void main(String[] args) {
		for (int i = 5; i >= 1; i--) {
			int k = i;
			for (int j = 1; j <= 5; j++) {
				System.out.print(k + " ");
				k = k + 5;
			}
			System.out.println();
		}

	}

}

//5 10 15 20 25 
//4 9 14 19 24 
//3 8 13 18 23 
//2 7 12 17 22 
//1 6 11 16 21 