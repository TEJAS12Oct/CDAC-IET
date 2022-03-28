package student;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		String name  = "";
		int age = 0;
		char gender  = 'M';
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name = ");
		name = sc.next();
		
		
		System.out.println("Enter age = ");
		age = sc.nextInt();
		
		gender = sc.next().charAt(0);
		
		
		//student s1 = new student (name,age,gender);
		//s1.print();
		
		student s1 = new student (name,age,gender);
		System.out.println(s1);
		student s2 = new student ("Tejas",22,'m');
		System.out.println(s2);
		
		
		
	}

}
