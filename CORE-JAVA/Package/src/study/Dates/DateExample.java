package study.Dates;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateExample {

	public static void main(String[] args) {
		Date Today = new Date();
		System.out.println(Today);

		GregorianCalendar Today2 = new GregorianCalendar();
		System.out.println(Today2);
//		int day = Today2.get(Calendar.DAY_OF_MONTH);
//		int Month = Today2.get(Calendar.MONTH) + 1;
///		int Year = Today2.get(Calendar.YEAR);
//		System.out.println(day + "/" + Month + "/" + Year);

		GregorianCalendar OtherDay = new GregorianCalendar(2022, 6 - 1, 30);

		Long Todaysmillis = Today2.getTimeInMillis();
		long OtherMillis = OtherDay.getTimeInMillis();
		long Difference = OtherMillis - Todaysmillis;

		long Days = (((Difference / (1000) / 60) / 60)) / 24;
		System.out.println("Days : " + Days);

		int WeekDay = OtherDay.get(Calendar.DAY_OF_WEEK);
		System.out.println("Week Day OF 30 June 2022 = " + WeekDay);

		System.out.println(Today2.get(Calendar.WEEK_OF_MONTH));

		// We after 17 days from Today ... What is 17th day?
		Today2.add(Calendar.DAY_OF_MONTH, 17);
		int day = Today2.get(Calendar.DAY_OF_MONTH);
		int Month = Today2.get(Calendar.MONTH) + 1;
		int Year = Today2.get(Calendar.YEAR);
		System.out.println(day + "/" + Month + "/" + Year);

		
	
	}

}
