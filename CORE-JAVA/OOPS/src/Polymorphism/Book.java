package Polymorphism;

public class Book {
	public int Book_No;
	public int ISBN_No;
	public String Title;
	public String publisher;

	public Book() {
	}

	public Book(int book_No, int iSBN_No, String title, String publisher) {
		Book_No = book_No;
		ISBN_No = iSBN_No;
		Title = title;
		this.publisher = publisher;
	}

	public int getBook_No() {
		return Book_No;
	}

	public void setBook_No(int book_No) {
		Book_No = book_No;
	}

	public int getISBN_No() {
		return ISBN_No;
	}

	public void setISBN_No(int iSBN_No) {
		ISBN_No = iSBN_No;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [Book_No=" + Book_No + ", ISBN_No=" + ISBN_No + ", Title=" + Title + ", publisher=" + publisher
				+ "]";
	}

	public void DisplayBookInfo() {
		System.out.println("Display : \n" + "Book_No = " + Book_No + ", ISBN_No= " + ISBN_No + ", Title = " + Title
				+ ", Publisher = " + publisher);
	}

}
