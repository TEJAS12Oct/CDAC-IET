package Constructor;

public class datec {
	int dd;
	int mm;
	int yy;

	datec() {
		dd = 0;
		mm = 0;
		yy = 0;

	}

	datec(int date, int month) {
		dd = date;
		mm = month;
		yy = 2022;
	}

	datec(int date, int month, int year) {
		dd = date;
		mm = month;
		yy = year;
	}

	void display() {
		System.out.println("Date = " + dd + "-" + mm + "-" + yy + "\n");
	}

	public static void main(String[] args) {
		datec d1 = new datec();
		datec d2 = new datec(15, 3);
		datec d3 = new datec(12, 10, 1999);

	    d1.display();
		d2.display();
		d3.display();

	}

}
