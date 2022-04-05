package BubbleStudent;


public class Main {
	public static void main(String[] args) {

	Student B1 = new Student("Tejas", 22, 'M', 340);
	Student B2 = new Student("Aniket", 25, 'M', 370);
	Student B3 = new Student("Roshan", 27, 'M', 400);
	Student B4 = new Student("Nisha", 20, 'F', 300);
	Student B5 = new Student("Sayali", 24, 'F', 335);

	Student[] students = new Student[5];
	students[0] = B1;
	students[1] = B2;
	students[2] = B3;
	students[3] = B4;
	students[4] = B5;
	
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
