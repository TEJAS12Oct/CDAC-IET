package Q3;

public class pattern {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) { // for rows
			for (int j = 1; j <= i; j++) { // for column
				if (j % 2 != 0)
					System.out.print(1 + " ");
				else if (j % 2 == 0)
					System.out.print(2 + " ");
			}
			i++;
			System.out.println();
		}

		for (int i = 3; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				if (j % 2 != 0)
					System.out.print(1 + " ");
				else if (j % 2 == 0)
					System.out.print(2 + " ");
			}
			i--;
			System.out.println();
		}

	}

}
