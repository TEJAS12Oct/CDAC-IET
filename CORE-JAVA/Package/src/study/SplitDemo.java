package study;

import java.util.Scanner;

public class SplitDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Comma Seprated Authors = ");
		String s = sc.nextLine();

		String[] authors = s.split(" , ");

		for (String author : authors)
			System.out.println("Authors Name = " + author);

		System.out.println("Enter - Seprated date : DD-MM-YY ==>");
		String Date = sc.next();
		String[] DateArr = Date.split("-");

		MyDate MD = new MyDate(Integer.parseInt(DateArr[0]), Integer.parseInt(DateArr[1]),
				Integer.parseInt(DateArr[2]));

		System.out.println(MD.getDate() + "-" + MD.getMonth() + "-" + MD.getYear());

	}

}
