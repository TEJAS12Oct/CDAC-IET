package Study.IsA;

public class Person {
	private String name;
	private MyDate DOB;

	public Person() {
		System.out.println("Person created");
	}

	public Person(String name, MyDate dOB) {
		super();
		this.name = name;
		DOB = dOB;
		System.out.println("Parameterized Constructor of Person");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyDate getDOB() {
		return DOB;
	}

	public void setDOB(MyDate dOB) {
		DOB = dOB;
	}

	public void show() {
		System.out.println(name + " " + DOB.getDate() + "-" + DOB.getMonth() + "-" + DOB.getYear());
	}
}
