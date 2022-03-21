package Constructor;

// Default  Construuctor
public class Date {

	int dd;
	int mm;
	int yy;

	Date() {
		System.out.println("Date = " + dd + "-" + mm + "-" + yy + "\n");

	}

	public static void main(String[] args) {
		Date d1 = new Date();

	}

}
