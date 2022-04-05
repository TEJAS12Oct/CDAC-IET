package Student;

public class Main {

	public static void main(String[] args) {

		Student s1 = new Student("Tejas", 22, 'M', 340);
		Student s2 = new Student("Aniket", 25, 'M', 370);
		Student s3 = new Student("Roshan", 27, 'M', 400);
		Student s4 = new Student("Nisha", 20, 'F', 300);
		Student s5 = new Student("Sayali", 24, 'F', 335);

		Student[] students = new Student[5];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		students[3] = s4;
		students[4] = s5;
		System.out.println("******************Display Information Student **************");
		Student.print(students);

		Student.NameAscending(students);
		Student.print(students);

		Student.NameDecending(students);
		Student.print(students);

		Student.AgeAscending(students);
		Student.print(students);

		Student.AgeDecending(students);
		Student.print(students);

		Student.MarksAscending(students);
		Student.print(students);

		Student.MarksDecending(students);
		Student.print(students);
	}

}
