package Constructor;

public class DatePc {
	int dd;
	int mm;
	int yy;

	DatePc(int date, int month, int year) {
		dd = date;
		mm = month;
		yy = year;

	}
	void  display() {
		System.out.println("Date = "+ dd+"-"+ mm+"-"+ yy+"\n");
	}

	public static void main(String[] args) {
		DatePc d1 = new DatePc(12, 10, 1999);
		DatePc d2 = new DatePc(15, 3, 2022);

		d1.display();
		d2.display();

	}

}
