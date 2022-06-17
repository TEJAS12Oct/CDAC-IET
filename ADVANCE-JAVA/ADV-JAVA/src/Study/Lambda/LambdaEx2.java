package Study.Lambda;

import java.util.Comparator;
import java.util.TreeSet;

public class LambdaEx2 {

	public static void main(String[] args) {

		Comparator<Student> CMP = (o1, o2) -> {

			if (o1.Roll > o2.Roll)
				return 1;
			if (o1.Roll < o2.Roll)
				return -1;
			else
				return 0;

		};

//		TreeSet<Student> TS = new TreeSet<Student>(CMP);
		TreeSet<Student> TS = new TreeSet<Student>();
		TS.add(new Student(1, "TEJAS"));
		TS.add(new Student(9, "RAM"));
		TS.add(new Student(30, "KRISHNA"));
		TS.add(new Student(4, "MAYUR"));
		TS.add(new Student(52, "GANESH"));
		TS.add(new Student(66, "HARI"));
		TS.add(new Student(15, "SHAM"));

		for (Student STUD : TS) {
			System.out.println(STUD);
		}

	}

}

class Student implements Comparable<Student> {
	int Roll;
	String Name;

	public Student(int roll, String name) {
		Roll = roll;
		Name = name;
	}

	@Override
	public String toString() {
		return "Roll : " + Roll + " , Name : " + Name;
	}

	@Override
	public int compareTo(Student o) {
		return this.Name.compareTo(o.Name);
	}

}