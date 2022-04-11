package Employee;
public class Employee {
	
	private String name;
	private int age;
	private int salary;
	
	public Employee()
	{
		this.name=" ";
		this.age=0;
		this.salary=0;
	}
	
	public Employee(String name,int age,int salary)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String toString()
	{
		String str="";
		str="Name = "+this.name+", Age = "+this.age+", Salary :"+this.salary;
		return str;
	}
}
