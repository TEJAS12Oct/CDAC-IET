package Study.IsA.HW;

public class Person
{
	private String name;
	private MyDate dob;
	
	public Person(String name, MyDate dob)
	{
		this.name = name;
		this.dob = dob;
	}

	public Person()
	{
		this.name = null;
		this.dob = null;
	}




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyDate getDob() {
		return dob;
	}

	public void setDob(MyDate dob) {
		this.dob = dob;
	}

	public String toString()
	{
		String s= "   Person==> name=" + name + ", dob=" + dob;
		return s;
	}
	

}
