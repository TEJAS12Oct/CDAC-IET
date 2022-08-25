package Day_16JUNE;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class User {
	private String name;
	private int day, month, year;

	public User(String name, int d, int m, int y) {
		this.name = name;
		this.day = d;
		this.month = m;
		this.year = y;

	}

	class AgeCal {
		void showAge() {
			GregorianCalendar Dob = new GregorianCalendar(year, month - 1, day);
			GregorianCalendar today = new GregorianCalendar();

			long todaymillis = today.getTimeInMillis();
			long othermillis = Dob.getTimeInMillis();

			long difference = todaymillis - othermillis;
			long Age = ((((difference / (1000)) / 60) / 60) / 24) / 365;
			System.out.print(name + " , The Age is : " + Age);

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The Name Is: ");
		String n = sc.nextLine();
		System.out.println("Enter day Of DOB: ");
		int dd = sc.nextInt();
		System.out.println("Enter Month Of DOB: ");
		int mm = sc.nextInt();
		System.out.println("Enter Year Of DOB: ");
		int yy = sc.nextInt();

		User u1 = new User(n, dd, mm, yy);
		AgeCal s = u1.new AgeCal();
		s.showAge();

	}// End Of Main

}// End Of The User Class
