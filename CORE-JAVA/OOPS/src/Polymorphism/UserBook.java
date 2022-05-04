package Polymorphism;

public class UserBook {

	public static void main(String[] args) {

		Book B = new Book(1, 11, "AA", "AAA");
		System.out.println("to String : \n " + B);
		B.DisplayBookInfo();
		System.out.println();

		Book B1 = new TextBook("AAAAA", 2, 22, "BB", "BBB");
		System.out.println("to String : \n " + B1);
		B1.DisplayBookInfo();
		System.out.println();

		Book B2 = new TextBook("AAAAA", new Book(2, 22, "BB", "BBB"));
		System.out.println("to String : \n " + B2);
		B2.DisplayBookInfo();
		System.out.println();

		Book B3 = new EditBook("DDDD", 4, 3, 33, "CC", "CCC");
		System.out.println("to String : \n " + B3);
		B3.DisplayBookInfo();
		System.out.println();

		Book B4 = new EditBook("EEEE", 7, new Book(5, 55, "FF", "FFF"));
		System.out.println("to String : \n " + B4);
		B4.DisplayBookInfo();
		System.out.println();

	}

}
