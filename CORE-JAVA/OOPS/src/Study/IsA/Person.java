package Study.IsA;

//import Study.HasA.MyDate;
//import Study.IsA.MyDate;

public class Person {
	private String name;
	private MyDate DOB;

	public Person() {
		System.out.println("Person created");
	}

	public Person(String name, Study.IsA.MyDate dob2) {
		super();
		this.name = name;
		dob2 = dob2;
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

	@Override
	public boolean equals(Object obj) {
		super.equals(obj);
		System.out.println("Person - Equals called");
		if (obj instanceof Patient) {
			Person temp = (Person) obj;
			if (this.name.equals(temp.name) && this.DOB.equals(temp.DOB)) {
				return true;
			} else
				return false;
		} else
			return false;
	}
}
