package Polymorphism;

public class TextBook extends Book {
	public String FirstAuthor;

	public TextBook() {
	}

	public TextBook(String firstAuthor) {
		FirstAuthor = firstAuthor;
	}

	public TextBook(String firstAuthor, int book_No, int iSBN_No, String title, String publisher) {
		super(book_No, iSBN_No, title, publisher);
		FirstAuthor = firstAuthor;
	}

	public TextBook(String firstAuthor, Book book) {
		super(book.Book_No,book.ISBN_No,book.publisher,book.Title);
		FirstAuthor = firstAuthor;
	}

	public String getFirstAuthor() {
		return FirstAuthor;
	}

	public void setFirstAuthor(String firstAuthor) {
		FirstAuthor = firstAuthor;
	}

	@Override
	public String toString() {
		return "TextBook [FirstAuthor=" + FirstAuthor + ", Book_No=" + Book_No + ", ISBN_No=" + ISBN_No + ", Title="
				+ Title + ", publisher=" + publisher + "]";
	}

	public void DisplayBookInfo() {
		super.DisplayBookInfo();
		System.out.println("FirstAuthor = " + FirstAuthor);
	}
}
