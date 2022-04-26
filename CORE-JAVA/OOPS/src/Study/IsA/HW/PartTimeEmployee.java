package Study.IsA.HW;

public class PartTimeEmployee extends Employee {
	private int workHour;

	PartTimeEmployee() {
		this.workHour = 0;
	}

	PartTimeEmployee(int workHour) {
		this.workHour = workHour;
	}

	PartTimeEmployee(int workHour, String department, int salary, int empid) {
		super(department, salary, empid);
		this.workHour = workHour;
	}

	PartTimeEmployee(int workHour, String department, int salary, int empid, String name, MyDate dob) {
		super(department, salary, empid, name, dob);
		this.workHour = workHour;
	}

	public int getWorkHour() {
		return workHour;
	}

	public void setWorkHour(int workHour) {
		this.workHour = workHour;
	}

	public String toString() {
		return "PartTimeEmployee=>workHour=" + workHour + "   " + super.toString();
	}

}
