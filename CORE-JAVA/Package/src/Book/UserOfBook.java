package Book;

public class UserOfBook {

	public static void main(String[] args) {

		Book FirstBook = new Book();
		FirstBook.setid(1);
		FirstBook.setBookName("Learning Core Java ");

		System.out.println("First Book => " + FirstBook.getid() + " " + FirstBook.getBookName());

		Book SecondBook = new Book(2, "Learning Java ");
		System.out.println("Second Book => " + SecondBook.getid() + " " + SecondBook.getBookName());
	}

}
