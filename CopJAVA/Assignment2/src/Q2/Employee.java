/*
Q2.Create a class Employee(empid,empname,basicSalary)
Write constructor,toString(),getter and setter method.
and also add calculateSalary() which calculate salary with incentive
where in incentaive is 1000rs for all employees.  
*/ package Q2;
 

public class Employee {
	private int empid;
	private String empname;
	private int basicSalary;

	public Employee(int id, String name, int bSalary) {
		empid = id;
		empname = name;
		basicSalary = bSalary;

	}

	void setId(int setId) {
		empid = setId;
	}

	public int getid() {
		return empid;
	}

	void setName(String setName) {
		empname = setName;
	}

	public String getName() {
		return empname;
	}

	void setSalary(int setSalary) {
		basicSalary = setSalary;
	}

	public int getSalary() {
		return basicSalary;
	}

	void display() {
		System.out.println("Empid = " + empid + " EmpName = " + empname + "   BasicSalary = " + basicSalary);
	}

	public String toString() {
		String str = ("Empid = " + empid + " EmpName = " + empname + "   BasicSalary = " + basicSalary);
		return str;

	}
	
	void calculateSalary() {
		int incentive = 1000;
		int calculateSalary = (basicSalary + incentive);
		System.out.println("Total Salary  = "+calculateSalary);
	}
}
