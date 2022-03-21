package Students;

public class student3 {
	String name;
	int age;
	char gender;

	student3() {

	}

	student3(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String toString() {
		String str = name + "," + age + "," + gender;
		return str;

	}

}
