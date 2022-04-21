package study.Book_Main;

import study.book.Book;

public class UserOfBook {

	public static void main(String[] args) {

//		 study.book.Book  => package qualified Class Name 
//		 study.book.Book FirstBook = new study.book.Book();

		Book FirstBook = new Book();
		FirstBook.setid(1);
		FirstBook.setBookName("Learning Core Java ");

		System.out.println("First Book =>=> " + FirstBook.getid() + " " + FirstBook.getBookName());

//		study.book.Book SecondBook = new study.book.Book(2, "Learning Java ");
		Book SecondBook = new Book(2, "Learning Java ");
		System.out.println("Second Book =>=> " + SecondBook.getid() + " " + SecondBook.getBookName());
	}

}
