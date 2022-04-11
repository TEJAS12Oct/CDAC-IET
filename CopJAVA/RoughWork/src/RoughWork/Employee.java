package RoughWork;

public class Employee {

	private int id;
	private int Salary;
	private String Name;

	public Employee(int id, String Name , int Salary) {

		this.id = id;
		this.Name = Name;
		this.Salary = Salary;
		

	}

	public void setid(int id) {
		this.id = id;
	}

	public int getid() {

		return id;
	}

	public void setSalary(int Salary) {
		this.Salary = Salary;
	}

	public int getSalary() {

		return Salary;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getName() {

		return this.Name;
	}
	
	public String toString() {
		String str = "ID " + id + "  NAME "  +  Name + " Salary " + Salary;
		return str;
	}

}
