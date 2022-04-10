package ArrayRevision1;

public class Student {
	private String name;
	private int age;
	private int marks;
	private char gender;

	public Student(String name, int age, int marks, char gender) {
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getmarks() {
		return marks;
	}

	public void setmarks(int marks) {
		this.marks = marks;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String toString() {
		String str = "";
		str = "Name = " + name + ", Age = " + age + ", Marks = " + marks + ", Gender  = " + gender;
		return str;
	}

	public static void Display(Student[] S) {
		System.out.print("\n*****************Display Information Student (Class)*****************\n");
		for (int i = 0; i < S.length; i++) {
			System.out.println(S[i]);

		}
	}

	public void youngerStudent(Student[] S) {
		System.out.println("\n*****************Display Younger Student (Object)*****************");
		for (int i = 0; i < S.length; i++) {
			if (S[i].getAge() < age) {
				age = S[i].getAge();
			}
		}
		System.out.println("Younger Student = " + age);
	}

	public int youngStudentReturn(Student[] S) {
		int i;
		System.out.println("\n*****************Display Younger Student (Return)*****************");
		for (i = 0; i < S.length; i++) {
			if (S[i].getAge() < age) {
				age = S[i].getAge();
			}
		}
		return age;

	}

	public void AvgAge(Student[] S) {
		int i, sum = 0;
		System.out.println("\n******************Average Age  Student****************************");
		for (i = 0; i < S.length; i++) {
			sum = sum + S[i].getAge();
		}

		float Avg = (sum / S.length);
		System.out.println("Avg Age = " + Avg);
	}

}
