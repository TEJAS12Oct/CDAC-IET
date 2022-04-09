package ArrayRevision;

public class Student {
	private String name;
	private int age;
	private int marks;

	public Student(String name, int age, int marks) {
		this.name = name;
		this.age = age;
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

	public int getmarks() {
		return marks;
	}

	public void setmarks(int marks) {
		this.marks = marks;
	}

	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}

	public static void Display(Student[] arr) {
		System.out.print("\nDisplay Information of Student\n");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Display data = " + arr[i]);
		}
	}

	public void print(Student[] arr, int index) {
		System.out.print("\nprint Information of Student\n");
		System.out.println("Print data = " + arr[index]);

	}
}
