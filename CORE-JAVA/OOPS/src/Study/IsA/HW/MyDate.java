package Study.IsA.HW;

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
	public boolean equals(Object obj)// runtime obj yeto
	{

		System.out.println("Mydate equals called");
		if (obj instanceof MyDate) {
			MyDate temp = (MyDate) obj;
			if (this.Date == temp.Date && this.Month == temp.Month && this.Year == temp.Year) {
				return true;
			} else
				return false;
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "MyDate [Date=" + Date + ", Month=" + Month + ", Year=" + Year + "]";
	}
}
