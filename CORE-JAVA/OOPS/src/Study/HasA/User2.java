package Study.HasA;

import java.util.Scanner;

public class User2 {

	public static void main(String[] args) {
//  accept value from the  user and create 3 TechnicalBook		

		TechnicalBook[] books = new TechnicalBook[2];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {

			System.out.println("Enter Book Name = ");
			String Name = sc.next();

			System.out.println("Enter Cost = ");
			double Cost = sc.nextDouble();

			System.out.println("Enter Day = ");
			int Day = sc.nextInt();

			System.out.println("Enter Month = ");
			int Month = sc.nextInt();

			System.out.println("Enter Year = ");
			int Year = sc.nextInt();

			MyDate MD = new MyDate(Day, Month, Year);

			System.out.println("Enter How Many Authors = ");
			int n = sc.nextInt();
			String[] Authors = new String[n];

			for (int j = 0; j < n; j++) {
				System.out.println("Enter Authors : ");
				Authors[j] = sc.next();
			}
			sc.nextLine(); // This is consuming my extra newLine

			books[i] = new TechnicalBook();
			books[i].setBookName(Name);
			books[i].setCost(Cost);

			books[i] = new TechnicalBook(Name, Cost, MD, Authors);

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
