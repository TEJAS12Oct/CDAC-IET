package Polymorphism;

public class UserMember {

	public static void main(String[] args) {

		Member M1 = new Member(1, "AAAA", new MyDate(1, 1, 1111));
		System.out.println("to String : \n " + M1);
		M1.Display();
		System.out.println();

		Member M2 = new PermanentMember(20, 2, "BBBB", new MyDate(2, 2, 2222));
		System.out.println("to String : \n " + M2);
		M2.Display();
		System.out.println();
		
		Member M3 = new TemporaryMember(2000, 2, "CCCC", new MyDate(3, 3, 3333));
		System.out.println("to String : \n " + M3);
		M3.Display();
		System.out.println();
	}

}
