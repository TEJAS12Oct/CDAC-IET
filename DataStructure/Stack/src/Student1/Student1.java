package Student1;

public class Student1 {

	String name;
	int age;
	char gender;

	Student1(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getname() {
		return this.name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public int getage() {
		return this.age;
	}

	public void setage(int age) {
		this.age = age;
	}

	public char getgender() {
		return this.gender;
	}

	public void setgender(char gender) {
		this.gender = gender;
	}

	public String toString() {

		String str = this.name + ":" + this.age + ":" + this.gender;
		return str;
	}

}
