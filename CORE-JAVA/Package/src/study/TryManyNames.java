package study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TryManyNames {

	public static void main(String[] args) {
		ArrayList<String> AL = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Comma Seprated Name :");
		String Names = sc.next();
		String[] arrnames = Names.split(",");

		Collections.addAll(AL, arrnames);
		for (String S : AL)
			System.out.println(S);

		// Collections.reverse(AL);
		Collections.sort(AL);
		String max = Collections.max(AL);
		System.out.println("Max : " + max);

		Collections.shuffle(AL);
		System.out.println("After Shuffling :");
		for (String S : AL)
			System.out.println(S);
	}

}
