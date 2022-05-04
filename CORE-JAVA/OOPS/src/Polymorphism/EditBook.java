package Polymorphism;

public class EditBook extends Book {
	public String Editor_Name;
	public int NO_of_Articles;

	EditBook() {
	}

	public EditBook(String editor_Name, int nO_of_Articles) {
		super();
		Editor_Name = editor_Name;
		NO_of_Articles = nO_of_Articles;
	}

	public EditBook(String editor_Name, int nO_of_Articles, int book_No, int iSBN_No, String title, String publisher) {
		super(book_No, iSBN_No, title, publisher);
		Editor_Name = editor_Name;
		NO_of_Articles = nO_of_Articles;
	}

	public EditBook(String editor_Name, int nO_of_Articles, Book book) {
		super(book.Book_No,book.ISBN_No,book.publisher,book.Title);
		Editor_Name = editor_Name;
		NO_of_Articles = nO_of_Articles;
	}

	public String getEditor_Name() {
		return Editor_Name;
	}

	public void setEditor_Name(String editor_Name) {
		Editor_Name = editor_Name;
	}

	public int getNO_of_Articles() {
		return NO_of_Articles;
	}

	public void setNO_of_Articles(int nO_of_Articles) {
		NO_of_Articles = nO_of_Articles;
	}

	@Override
	public String toString() {
		return "EditBook [Editor_Name=" + Editor_Name + ", NO_of_Articles=" + NO_of_Articles + ", Book_No=" + Book_No
				+ ", ISBN_No=" + ISBN_No + ", Title=" + Title + ", publisher=" + publisher + "]";
	}

	public void DisplayBookInfo() {
		super.DisplayBookInfo();
		System.out.println("Editor_Name = " + Editor_Name + ", NO_of_Articles=" + NO_of_Articles);
	}

}
