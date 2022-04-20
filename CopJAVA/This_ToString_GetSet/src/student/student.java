package student;

public class student {
	String name;
	int age;
	char gender;

	student() {
		name = "";
		age = 0;
		gender = 'm';
	}

	student(String n) {
		name = n;
		age = 0;
		gender = 'm';
	}

	student(String n, int a, char g) {
		name = n;
		age = a;
		gender = 'm';
	}

//  *****************using print  method *************
	// Tejas,22,m
	void print() {
		System.out.println(name + "," + age + "," + gender);
	}

//********************using  toString*********************

	public String toString() {
		String str = name + "," + age + "," + gender;
		return str;

	}
}