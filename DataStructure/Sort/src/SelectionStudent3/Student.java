package SelectionStudent3;

public class Student {

	private String name;
	private int age;
	private char gender;
	private int marks;

	Student(String name, int age, char gender, int marks) {

		this.name = name;
		this.age = age;
		this.gender = gender;
		this.marks = marks;
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String toString() {
		String str = "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", marks=" + marks + "]";
		return str;
	}

}