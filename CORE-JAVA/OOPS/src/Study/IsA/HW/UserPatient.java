package Study.IsA.HW;

public class UserPatient {

	public static void main(String[] args) {

		Patient p1 = new Patient("B+ve", "112 mmHg", "71 BPM", "AAA", new MyDate(10, 10, 2010));
		Patient p2 = new Patient("A+ve", "110 mmHg", "68 BPM", "BBB", new MyDate(1, 1, 2010));
		Patient p3 = new Patient("O+ve", "115 mmHg", "65 BPM", "CCC", new MyDate(10, 1, 2011));
		Patient p4 = new Patient("B+ve", "160 mmHg", "66 BPM", "DDD", new MyDate(7, 10, 2017));
		Patient p5 = new Patient("A+ve", "140 mmHg", "70 BPM", "EEE", new MyDate(10, 5, 2010));

		System.out.println(p1.getBp());
		System.out.println(p1.getName());
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);

	}

}
