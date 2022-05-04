package Q2;

public class TechnicalBook {

	private String BookName;
	private double Cost;

//	HAS-A reference Of MyDAte
	private MyDate DateOfPublication;

//	HAs-A reference String[] Author
	private String[] Authors;

	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	public double getCost() {
		return Cost;
	}

	public void setCost(double cost) {
		Cost = cost;
	}

	public MyDate getDateOfPublication() {
		return DateOfPublication;
	}

	public void setDateOfPublication(MyDate dateOfPublication) {
		DateOfPublication = dateOfPublication;
	}

	public String[] getAuthors() {
		return Authors;
	}

	public void setAuthors(String[] authors) {
		Authors = authors;
	}

	public TechnicalBook() {
	}

	public TechnicalBook(String bookName, double cost, MyDate dateOfPublication, String[] authors) {
	//	super();
		BookName = bookName;
		Cost = cost;
		DateOfPublication = dateOfPublication;
		Authors = authors;
	}
}
