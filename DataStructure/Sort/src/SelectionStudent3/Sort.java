package SelectionStudent3;

public class Sort {

	public static void NameAscending(Student[] students) {
		System.out.println("************Ascending Name Sorting *************");
		for (int t = 0; t < students.length - 1; t++) {
			int i = t;
			Student x = students[i];
			while (i < students.length) {
				if (students[i].getName().compareTo(x.getName()) < 0) {
					Student tmp = students[i];
					students[i] = x;
					x = tmp;

				}
				i++;

			}
			students[t] = x;
		}

	}

	public static void NameDecending(Student[] students) {
		System.out.println("************Decending Name Sorting *************");
		for (int t = 0; t < students.length - 1; t++) {
			int i = t;
			Student x = students[i];
			while (i < students.length) {
				if (students[i].getName().compareTo(x.getName()) > 0) {
					Student tmp = students[i];
					students[i] = x;
					x = tmp;

				}
				i++;

			}
			students[t] = x;
		}

	}

	public static void AgeAscending(Student[] students) {
		System.out.println("************Ascending Age Sorting *************");

		for (int t = 0; t < students.length - 1; t++) {
			int i = t;
			Student x = students[i];

			while (i < students.length) {
				if (students[i].getAge() < x.getAge()) {
					Student tmp = students[i];
					students[i] = x;
					x = tmp;
				}
				i++;
			}
			students[t] = x;
		}

	}

	public static void AgeDecending(Student[] students) {
		System.out.println("************Decending Age Sorting *************");
		for (int t = 0; t < students.length - 1; t++) {
			int i = t;
			Student x = students[i];
			while (i < students.length) {
				if (students[i].getAge() > x.getAge()) {
					Student tmp = students[i];
					students[i] = x;
					x = tmp;

				}
				i++;

			}
			students[t] = x;
		}

	}

	public static void MarksAscending(Student[] students) {
		System.out.println("************Ascending Marks Sorting *************");
		for (int t = 0; t < students.length - 1; t++) {
			int i = t;
			Student x = students[i];
			while (i < students.length) {
				if (students[i].getMarks() < x.getMarks()) {
					Student tmp = students[i];
					students[i] = x;
					x = tmp;

				}
				i++;

			}
			students[t] = x;
		}

	}

	public static void MarksDecending(Student[] students) {
		System.out.println("************Decending Age Sorting *************");
		for (int t = 0; t < students.length - 1; t++) {
			int i = t;
			Student x = students[i];
			while (i < students.length) {
				if (students[i].getMarks() > x.getMarks()) {
					Student tmp = students[i];
					students[i] = x;
					x = tmp;

				}
				i++;

			}
			students[t] = x;
		}

	}

	public static void print(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i] + " ,");
		}
		System.out.println();
	}

}
