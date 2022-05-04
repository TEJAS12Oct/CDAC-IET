package Study.errors.Customs;

import java.util.Random;
import java.util.Scanner;

public class PlayGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Game obj = null;

		int flag = 0;
		while (true) {
			if (flag == 0) {
				obj = new Game(new Random());

			}
			System.out.println("Hidden No = " + obj.hiddenNumber);
			System.out.println("Enter your number: ");
			int x = sc.nextInt();
			int number = obj.is_Matching(x);
			flag++; // 1

			if (number == -1) {
				System.out.println(" Wrong input ..! number should be less than current number..");
			} else if (number == 1) {
				System.out.println(" Wrong input ...! number should be greater than current number");
			} else {
				System.out.println(" Bingo U won. Congratulation's...!!!");
				flag = obj.getChances();

			}
			if (flag == obj.getChances()) {
				System.out.print(" Do u want to play again..? \n yes / no plz enter choice [Y /N] : ");
				char no = sc.next().charAt(0);
				if (no == 'Y' || no == 'y') {
					flag = 0;
					continue;
				} else {
					System.out.println(" Game Over...!! ");
					break;
				}
			}

		}

	}
}
