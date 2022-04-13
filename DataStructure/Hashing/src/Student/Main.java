package Student;

public class Main {

	public static void main(String[] args) {

		Hash h = new Hash(10);

		Student S1 = new Student("Tejas", 12, 'M', 1223334445);
		Student S2 = new Student("RAM", 13, 'M', 1234567899);
		Student S3 = new Student("YASH", 14, 'M', 1334449999);

		System.out.println("***********************  Linear Porbing  ********************************");
		h.insertL(S1);
		h.insertL(S2);
		h.insertL(S3);
		System.out.println("Insert Linear =  " + h + "\n");
		
		System.out.println("************************* Remove Linear Porbing *************************");
		
		h.removeL(S1);
		System.out.println("Remove Linear =  " + h + "\n");

	}

}
