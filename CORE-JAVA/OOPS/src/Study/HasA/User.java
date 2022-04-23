package Study.HasA;

public class User {

	public static void main(String[] args) {

		TechnicalBook B1 = new TechnicalBook();
		B1.setBookName("Core Java Unplugged");
		B1.setCost(450);
		B1.setDateOfPublication(new MyDate(12, 10, 1999));
		B1.setAuthors(new String[] { "Tejas", "Pankaj", "Atharv" });

		TechnicalBook B2 = new TechnicalBook("Thinking in java ", 750, new MyDate(22, 4, 2022),
				new String[] { "Ruchita", "Mayur", "Akshay" });

		System.out.println("Year of Publication of B1 = " + B1.getDateOfPublication().getYear());
		System.out.println("Totak Authors of B2  = " + B2.getAuthors().length);
		System.out.println("Total Cost OF Both Books = " + ( B1.getCost() + B2.getCost() ));

	}

}
