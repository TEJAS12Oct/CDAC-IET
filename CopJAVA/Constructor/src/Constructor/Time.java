package Constructor;

// Default  Constructor

public class Time {

	int hh;
	int mm;
	int ss;

	Time() {
		System.out.println("hh = " + hh + "\n" + "mm = " + mm + "\n" + "ss = " + ss);
	}

	public static void main(String[] args) {
		Time t = new Time();

	}

}
