package Study.HasA;

import java.util.Arrays;

public class TechnicalBook {

	private String BookName;
	private double Cost;

//	HAS-A reference Of MyDAte
	private MyDate DateOfPublication;

	// HAs-A reference String[] Author
	private String[] Authors;

	public TechnicalBook() {
	}

	public TechnicalBook(String bookName, double cost, MyDate dateOfPublication, String[] authors) {
		super();
		BookName = bookName;
		Cost = cost;
		DateOfPublication = dateOfPublication;
		Authors = authors;
	}

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

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof TechnicalBook) {
			TechnicalBook temp = (TechnicalBook) obj;
			if (this.BookName == temp.BookName && this.Cost == temp.Cost
					&& this.DateOfPublication.equals(temp.DateOfPublication)
					&& Arrays.deepEquals(this.Authors, temp.Authors)) // &&this.compareAuthors(temp.authors)
			{
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	private boolean compareAuthors(String[] authors2) {
		if (this.Authors.length == authors2.length) {
			for (int i = 0; i < this.Authors.length; i++) {
				if (!this.Authors[i].equals(authors2[i]))
					return false;
			}
			return true;
		} else
			return false;
	}

	@Override
	public String toString() {
		return "TechnicalBook [BookName=" + BookName + ", Cost=" + Cost + ", DateOfPublication=" + DateOfPublication
				+ ", Authors=" + Arrays.toString(Authors) + "]";
	}

}
