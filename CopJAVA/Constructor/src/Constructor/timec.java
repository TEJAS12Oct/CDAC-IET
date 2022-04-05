package Constructor;

public class timec {
	int hh;
	int mm;
	int ss;

	timec() {
		hh = 11;
		mm = 16;
		ss = 37;
	}

	timec(int hrs, int min) {
		hh = hrs;
		mm = min;
		ss = 20;
	}

//	timec(int hrs, int min, int sec) {
//		hh = hrs;
//		mm = min;
//		ss = sec;
//	}
	
	
	timec(int hh, int mm, int ss) {
		this.hh = hh;
		this.mm = mm;
		this.ss = ss;
	}

	void display() {
		System.out.println("hh = " + hh + "\t" + "mm = " + mm + "\t" + "ss = " + ss);
	}

	public static void main(String[] args) {
		timec t1 = new timec();
		timec t2 = new timec(12, 10);
		timec t3 = new timec(12, 10, 1999);

		t1.display();
		t2.display();
		t3.display();

	}

}
