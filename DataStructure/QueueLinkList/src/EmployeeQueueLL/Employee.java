package EmployeeQueueLL;

public class Employee {
	
	private String name;
	private int id;
	private int gender;

	Employee(String name, int id, char gender) {
		this.name = name;
		this.id = id;
		this.gender = gender;
	}

	public String toString() {
		String str = "";
		str = name + " ," + id + " ," + gender;
		return str;
	}

}
