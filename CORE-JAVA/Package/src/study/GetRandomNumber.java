package study;

import java.util.Random;

public class GetRandomNumber {

	public static void main(String[] args) {
		Random random = new Random();

		int x = random.nextInt(119);
		// Display Any Random No
		System.out.println("Next Answer should be given by roll Number  = " + x);
	}

}
