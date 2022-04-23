package SelectionStudent;

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
		for (int t = 0; t < arr.length - 1; t++) {
			int i = t;
			Student x = arr[i];
			while (i < arr.length) {
				if (arr[i].name.compareTo(x.name) < 0) {
					Student tmp = arr[i];
					arr[i] = x;
					x = tmp;

				}
				i++;

			}
			arr[t] = x;
		}

	}

	public static void NameDecending(Student[] arr) {
		System.out.println("************Decending Name Sorting *************");
		for (int t = 0; t < arr.length - 1; t++) {
			int i = t;
			Student x = arr[i];
			while (i < arr.length) {
				if (arr[i].name.compareTo(x.name) > 0) {
					Student tmp = arr[i];
					arr[i] = x;
					x = tmp;

				}
				i++;

			}
			arr[t] = x;
		}

	}

	public static void AgeAscending(Student[] arr) {
		System.out.println("************Ascending Age Sorting *************");

		for (int t = 0; t < arr.length - 1; t++) {
			int i = t;
			Student x = arr[i];

			while (i < arr.length) {
				if (arr[i].age < x.age) {
					Student tmp = arr[i];
					arr[i] = x;
					x = tmp;
				}
				i++;
			}
			arr[t] = x;
		}

	}

	public static void AgeDecending(Student[] arr) {
		System.out.println("************Decending Age Sorting *************");
		for (int t = 0; t < arr.length - 1; t++) {
			int i = t;
			Student x = arr[i];
			while (i < arr.length) {
				if (arr[i].age > x.age) {
					Student tmp = arr[i];
					arr[i] = x;
					x = tmp;

				}
				i++;

			}
			arr[t] = x;
		}

	}

	public static void MarksAscending(Student[] arr) {
		System.out.println("************Ascending Marks Sorting *************");
		for (int t = 0; t < arr.length - 1; t++) {
			int i = t;
			Student x = arr[i];
			while (i < arr.length) {
				if (arr[i].marks < x.marks) {
					Student tmp = arr[i];
					arr[i] = x;
					x = tmp;

				}
				i++;

			}
			arr[t] = x;
		}

	}

	public static void MarksDecending(Student[] arr) {
		System.out.println("************Decending Age Sorting *************");
		for (int t = 0; t < arr.length - 1; t++) {
			int i = t;
			Student x = arr[i];
			while (i < arr.length) {
				if (arr[i].marks > x.marks) {
					Student tmp = arr[i];
					arr[i] = x;
					x = tmp;

				}
				i++;

			}
			arr[t] = x;
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
