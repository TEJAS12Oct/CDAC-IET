package StudentCLL;

public class Main {

	public static void main(String[] args) {

		Student S = new Student();
		Student S1 = new Student("Tejas",12,222);
		Student S2 = new Student("Raj",13,333);
		Student S3 = new Student("Shyam",14,444);
		Student S4 = new Student("Yash",15,555);
		Student S5 = new Student("Sagar",16,666);
		Student S6 = new Student("Nisha",17,777);
		Student S7 = new Student("Aishwarya",18,888);

		StudentCLL Scll = new StudentCLL();
		Scll.insert(S1);
		Scll.insert(S2);
		Scll.insert(S3);
		System.out.println("Insert  = " + Scll + "\n");

		Scll.append(S4);
		Scll.append(S5);
		Scll.append(S6);
		System.out.println("Append  = " + Scll + "\n");

		Scll.InsertByPosition(3, S7);
		System.out.println("Insert By Poition = " + Scll + "\n");

		Scll.DeleteFirst();
		System.out.println("Delete First  = " + Scll + "\n");

		Scll.DeleteLast();
		System.out.println("Delete Last = " + Scll + "\n");

		Scll.DeleteByPosition(3);
		System.out.println("Delete By Position = " + Scll + "\n");

	}

}
