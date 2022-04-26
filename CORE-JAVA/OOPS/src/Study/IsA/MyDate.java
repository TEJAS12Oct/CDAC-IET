package Study.IsA;

public class MyDate {

	private int Date, Month, Year;

	public MyDate() {
	}

	public MyDate(int date, int month, int year) {
//		super();
		Date = date;
		Month = month;
		Year = year;
	}

	public int getDate() {
		return Date;
	}

	public void setDate(int date) {
		Date = date;
	}

	public int getMonth() {
		return Month;
	}

	public void setMonth(int month) {
		Month = month;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	@Override
	public String toString() {
		return "MyDate [Date=" + Date + ", Month=" + Month + ", Year=" + Year + "]";
	}
}
