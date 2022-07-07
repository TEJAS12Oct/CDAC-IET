package Some.Other;

import org.springframework.stereotype.Component;

@Component
public class MyDate {
	
	private int day,month,year;
	
	public MyDate()
	{
		day=1; month=1;year=2000;
		System.out.println("mydate constructor called..");
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	

}
