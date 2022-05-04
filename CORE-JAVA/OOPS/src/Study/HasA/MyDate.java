package Study.HasA;

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

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyDate) {
			MyDate temp = (MyDate) obj;
			if (this.Date == temp.Date && this.Year == temp.Year && this.Month == temp.Month) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
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
		String S = Date + "/" + Month + "/" + Year;
		return S;
	}
}
