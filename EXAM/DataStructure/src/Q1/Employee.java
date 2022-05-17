package Q1;

public class Employee {
	String Name;
	int Id;
	char Gender;

	Employee(String Name, int Id, char Gender) { // Parameterized Constructor
		this.Name = Name;
		this.Id = Id;
		this.Gender = Gender;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public char getGender() {
		return Gender;
	}

	public void setGender(char Gender) {
		this.Gender = this.Gender;
	}

	public String toString() {
		String str = "";
		str = Name + " ," + Id + " ," + Gender;
		return str;
	}

}
