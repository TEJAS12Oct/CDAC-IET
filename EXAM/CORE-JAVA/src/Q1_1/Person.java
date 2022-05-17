package Q1_1;

public class Person {

	public String Name;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Person() {
		
	}

	public Person(String name) { // Parameterized Constructor
		super();
		Name = name;
	}

	@Override
	public String toString() {
		return "Person [Name=" + Name + "]";
	}

} // End Of Class
