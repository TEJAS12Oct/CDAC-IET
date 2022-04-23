package Student;

public class Student {

	private String name;
	private int age;
	private char gender;
	private long mobileNo;
	

	Student(String name, int age, char gender , long mobileNo) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.mobileNo =mobileNo;
	}

	public String toString() {
		String str = "";
		str = name + " ," + age + " ," + gender + " ," + mobileNo;
		return str;
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

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	

}
