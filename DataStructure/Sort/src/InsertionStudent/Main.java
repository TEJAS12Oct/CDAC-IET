package InsertionStudent;

public class Main {

	public static void main(String[] args) {

		Student I1 = new Student("Tejas", 22, 'M', 340);
		Student I2 = new Student("Aniket", 25, 'M', 370);
		Student I3 = new Student("Roshan", 27, 'M', 400);
		Student I4 = new Student("Nisha", 20, 'F', 300);
		Student I5 = new Student("Sayali", 24, 'F', 335);

		Student[] students = new Student[5];
		students[0] = I1;
		students[1] = I2;
		students[2] = I3;
		students[3] = I4;
		students[4] = I5;
		
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
