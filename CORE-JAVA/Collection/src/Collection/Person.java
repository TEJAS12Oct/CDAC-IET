package Collection;

public class Person implements Comparable<Person> {
	private String name;
	private int id;
	private MyDate dob;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Person(String name, int id, MyDate dob) {
		super();
		this.name = name;
		this.id = id;
		this.dob = dob;
	}

	public Person(String name, MyDate dob) {
		this.name = name;
		this.dob = dob;
	}

	public Person() {
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", dob=" + dob + "]";
	}

	@Override
	public int compareTo(Person o) {
//  We Have to Decided the Basics Of Sorting --> By Name OR By DOB
		return this.name.compareTo(o.name);
	}

/*
	@Override
	public int compareTo(Person o) {

		if (this.getId() > o.getId())
			return 1;
		if (this.getId() < o.getId())
			return -1;
		else
			return 0;
	}
*/	
}
