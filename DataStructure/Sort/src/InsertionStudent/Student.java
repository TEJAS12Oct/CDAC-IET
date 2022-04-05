package InsertionStudent;

public class Student {

	private String name;
	private int age;
	private char gender;
	private int marks;

	public Student(String name, int age, char gender, int marks) {

		this.name = name;
		this.age = age;
		this.gender = gender;
		this.marks = marks;
	}

	public static void NameAscending(Student[] arr) {
		System.out.println("************Ascending Name Sorting *************");
		int i, j;
		for (j = 1; j < arr.length; j++) {
			i = j;

			while (i > 0) {
				if (arr[i].name.compareTo(arr[i - 1].name) < 0) {

					String tmp = arr[i].name;
					arr[i].name = arr[i - 1].name;
					arr[i - 1].name = tmp;
					i--;
				} else
					break;
			}
		}

	}

	public static void NameDecending(Student[] arr) {
		System.out.println("************Decending Name Sorting *************");
		int i, j;
		for (j = 1; j < arr.length; j++) {
			i = j;

			while (i > 0) {
				if (arr[i].name.compareTo(arr[i - 1].name) > 0) {

					String tmp = arr[i].name;
					arr[i].name = arr[i - 1].name;
					arr[i - 1].name = tmp;
					i--;
				} else
					break;
			}
		}

	}

	public static void AgeAscending(Student[] arr) {
		System.out.println("************Ascending Age Sorting *************");

		int i, j;
		for (j = 1; j < arr.length; j++) {
			i = j;

			while (i > 0) {
				if (arr[i].age < arr[i - 1].age) {

					int tmp = arr[i].age;
					arr[i].age = arr[i - 1].age;
					arr[i - 1].age = tmp;
					i--;
				} else
					break;
			}
		}

	}

	public static void AgeDecending(Student[] arr) {
		System.out.println("************Decending Age Sorting *************");
		int i, j;
		for (j = 1; j < arr.length; j++) {
			i = j;

			while (i > 0) {
				if (arr[i].age > arr[i - 1].age) {

					int tmp = arr[i].age;
					arr[i].age = arr[i - 1].age;
					arr[i - 1].age = tmp;
					i--;
				} else
					break;
			}
		}

	}

	public static void MarksAscending(Student[] arr) {
		System.out.println("************Ascending Marks Sorting *************");
		int i, j;
		for (j = 1; j < arr.length; j++) {
			i = j;

			while (i > 0) {
				if (arr[i].marks < arr[i - 1].marks) {

					int tmp = arr[i].marks;
					arr[i].marks = arr[i - 1].marks;
					arr[i - 1].marks = tmp;
					i--;
				} else
					break;
			}
		}

	}

	public static void MarksDecending(Student[] arr) {
		System.out.println("************Decending Age Sorting *************");
		int i, j;
		for (j = 1; j < arr.length; j++) {
			i = j;

			while (i > 0) {
				if (arr[i].marks > arr[i - 1].marks) {

					int tmp = arr[i].marks;
					arr[i].marks = arr[i - 1].marks;
					arr[i - 1].marks = tmp;
					i--;
				} else
					break;
			}
		}
	}

	public static void print(Student[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ,");
		}
		System.out.println();
	}

	public String toString() {
		String str = "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", marks=" + marks + "]";
		return str;
	}

}
