package Q2;

import java.util.Scanner;

public class User3 {

	public static void main(String[] args) {
		// accept value from the user and create 3 TechnicalBook

		TechnicalBook[] books = new TechnicalBook[1];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 1; i++) {

			System.out.println("Enter Book Name = ");
			String Name = sc.next();

			System.out.println("Enter Cost = ");
			double Cost = sc.nextDouble();

			System.out.println("Enter Comma Seprated Authors = ");
			sc.nextLine();
			String s = sc.next();
			String[] authors = s.split(" , ");

			for (String author : authors)
				System.out.println("Authors Name = " + author);

			System.out.println("Enter - Seprated date : DD-MM-YY ==>");
			sc.nextLine();
			String Date = sc.nextLine();
			String[] DateArr = Date.split("-");

			MyDate MD = new MyDate(Integer.parseInt(DateArr[0]), Integer.parseInt(DateArr[1]),
					Integer.parseInt(DateArr[2]));

			System.out.println(MD.getDate() + "-" + MD.getMonth() + "-" + MD.getYear());

//			sc.nextLine(); // This is consuming my extra newLine

			books[i] = new TechnicalBook();
			books[i].setBookName(Name);
			books[i].setCost(Cost);

			books[i] = new TechnicalBook(Name, Cost, MD, authors);

		}

		for (TechnicalBook TB : books) { // For each Technical Book TB in Books
			System.out.println("\nBook Name = " + TB.getBookName() + " , Cost = " + TB.getCost() + " , Year = "
					+ TB.getDateOfPublication().getYear());
			System.out.print("Authors Name : ");
			for (String s : TB.getAuthors()) {
				System.out.print(s + " , ");

			}
			System.out.println();
		}
	}

}
