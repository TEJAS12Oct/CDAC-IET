package study.book;

public class Book {

	private int id;
	private String BookName;

	public Book() {
	}

	public Book(int id, String BookName) {
		this.id = id;
		this.BookName = BookName;
	}

	public void setid(int id) {
		this.id = id;
	}

	public int getid() {
		return id;
	}

	public void setBookName(String BookName) {
		this.BookName = BookName;

	}

	public String getBookName() {
		return BookName;
	}
}
