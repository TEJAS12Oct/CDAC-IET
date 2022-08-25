package Day_16JUNE;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {

	static ArrayList<Student> AL = new ArrayList<Student>();

	public static void main(String[] args) {

		AL.add(new Student(1, "Tejas"));
		AL.add(new Student(2, "RAM"));
		AL.add(new Student(30, "KRIshna"));
		AL.add(new Student(15, "MAyuR"));
		AL.add(new Student(25, "GAneSH"));
		AL.add(new Student(7, "RUCHITA"));

		AL.stream().forEach((element) -> { // forEach is method of Stream
			System.out.println("This is : " + element);
		});

		System.out.println("\nUppercase Name : ");
		AL.stream().forEach((Student) -> {
			System.out.println(Student.Name.toUpperCase());
		});

		System.out.println("\nAfter Filtering : ");

		Stream<Student> filterdStream = AL.stream().filter((Student) -> {
			if (Student.Roll > 10)
				return true;
			else
				return false;
		});
		filterdStream.forEach((e) -> {
			System.out.println(e);
		});

	} // EOM

}
