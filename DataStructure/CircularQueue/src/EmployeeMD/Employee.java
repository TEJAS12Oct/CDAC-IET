package EmployeeMD;

public class Employee {
	
	private int Id;
	private String Name;
	private int Salary;
	
	
	
	public Employee(int Id,int Salary,String name )
	{
		this.Id=Id;
		this.Name=name;
		this.Salary=Salary;
	}
	
	
	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}

	public void setSalary(int salary) {
		Salary =salary;
	}

	public int getSalary() {
		return Salary;
	}
	private int calculateSalary(int n)
	{
		return (Salary+n);
	}

	

	public String toString()
	{
		return new String("Employee ID: "+Id+ "\nEmployee Name: "+ Name+" \nEmployee Basic  Salary: "+ (Salary )+" Rs");
	}
	public int getCalculateSalary(int n)
	{
		return calculateSalary(n);
	}
	

}
