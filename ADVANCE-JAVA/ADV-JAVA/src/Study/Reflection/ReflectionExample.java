package Study.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ReflectionExample {

	public static void main(String[] args) throws ClassNotFoundException {
		// 3 ways to class CLASS Object

		// If you know the class name while writing the code then use this way
		Class C1 = String.class;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Class Name : "); // Type in Console => Study.Lambda.Student
		Class C2 = Class.forName(sc.next());

		// When u have the object of the class but dont know the class Name
//		String S = new String("HEllo");

		Thread S = new Thread();
		Class C3 = S.getClass();

		System.out.println(C1.getName());
		System.out.println(C2.getName());
		System.out.println(C3.getName());

		// to know fields of C3
//		Field[] fields = C3.getFields();
		Field[] fields = C2.getDeclaredFields();
		for (Field F : fields) {
			System.out.println(F.getName() + "  " + F.getType());
		}

		// Same for All Methods
		Method[] methods = C1.getDeclaredMethods();
		for (Method M : methods) {
			System.out.println(M.getName());
		}

		// Same for All Constructor
		Constructor[] C = C1.getDeclaredConstructors();
		for (Constructor Constructor : C) {
			System.out.println(Constructor);
		}

	}

}
