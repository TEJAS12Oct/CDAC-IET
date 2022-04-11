package Employee;

public class Employee {
	private String name;
	private int id;
	private int Salary;

	public Employee() {
		this.name = name;
		this.id = id;
		this.Salary = Salary;

	}

	Employee(String name, int id, int Salary) {
		this.name = name;
		this.id = id;
		this.Salary = Salary;
	}
	
	
	public String  toString() {
		String str = "";
		str = name + " " + id + " "+ Salary;
		return str;
	}

}
