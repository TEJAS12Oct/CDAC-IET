package Study.IsA.HW;

public class Employee extends Person {
	String Department;
	int salary;
	int empid;

	public Employee(String department, int salary, int empid, String name, MyDate dob) {
		super(name, dob);// super constructor
		Department = department;
		this.salary = salary;
		this.empid = empid;
		System.out.println("Parameterised constructor of employee");
	}

	public Employee(String department, int salary, int empid) {

		Department = department;
		this.salary = salary;
		this.empid = empid;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public Employee() { // super();
		System.out.println("Employee created");

	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String toString() {
		return "Department=" + Department + ", salary=" + salary + ", empid=" + empid + "" + super.toString();
	}

}
