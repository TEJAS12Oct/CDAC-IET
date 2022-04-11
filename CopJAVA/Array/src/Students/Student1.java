package Students;

public class Student1 {
	
	String name;
	int age;
	char gender;

	Student1(String n, int a, char g) {
		name = n;
		age = a;
		gender = 'm';
	}

	public String toString() {
		String str = name + "," + age + "," + gender;
		return str;

	}

	public int getAge() {
		return age;
	}

	public void setAge(int a) {
		age = a;
	}
}
