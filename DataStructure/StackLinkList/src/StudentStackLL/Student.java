package StudentStackLL;

public class Student {

	private String name;
	private int age;
	private int Marks;

	Student(String name, int age, int Marks) {
		this.name = name;
		this.age = age;
		this.Marks = Marks;
	}

	public String toString() {
		String str = "";
		str = name + " ," + age + " ," + Marks;
		return str;
	}

}
