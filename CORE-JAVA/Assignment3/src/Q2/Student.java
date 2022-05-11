package Q2;

import java.io.Serializable;

public class Student implements Comparable<Student>, Serializable {

	private static final long serialVersionUID = 1L;
	private String studentName;
	private double Percentage;
	private int rollNo;
	private String address;

	public Student() {
	}

	public Student(String studentName, double percentage, int rollNo, String address) {
		super();
		this.studentName = studentName;
		Percentage = percentage;
		this.rollNo = rollNo;
		this.address = address;
	}

	public Student(String studentName, double percentage) {
		super();
		this.studentName = studentName;
		Percentage = percentage;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getPercentage() {
		return Percentage;
	}

	public void setPercentage(double percentage) {
		Percentage = percentage;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student Name : " + studentName + "\nPercentage : " + Percentage + "\nRoll No : " + rollNo + "Address : "
				+ address;
	}

	@Override
	public int compareTo(Student o) {
		return this.studentName.compareToIgnoreCase(o.studentName);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student o = (Student) obj;
			if (this.studentName.equals(o.studentName) && this.rollNo == o.rollNo
					&& this.address.equalsIgnoreCase(address) && this.Percentage == o.Percentage)
				return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		String str = this.studentName + this.rollNo + this.Percentage + this.address;
		return str.hashCode();
	}
}
