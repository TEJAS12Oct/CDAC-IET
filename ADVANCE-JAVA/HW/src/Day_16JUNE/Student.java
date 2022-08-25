package Day_16JUNE;

public class Student {

	int Roll;
	String Name;

	public Student(int roll, String name) {
		super();
		Roll = roll;
		Name = name;
	}

	@Override
	public String toString() {
		return "Student [Roll=" + Roll + ", Name=" + Name + "]";
	}

}
