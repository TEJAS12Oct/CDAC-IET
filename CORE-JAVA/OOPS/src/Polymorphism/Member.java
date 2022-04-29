package Polymorphism;

public class Member {
	int id;
	String name;
	MyDate Date_of_Membership;

	public Member() {
	}

	public Member(int id, String name, MyDate date_of_Membership) {

		this.id = id;
		this.name = name;
		Date_of_Membership = date_of_Membership;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyDate getDate_of_Membership() {
		return Date_of_Membership;
	}

	public void setDate_of_Membership(MyDate date_of_Membership) {
		Date_of_Membership = date_of_Membership;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", Date_of_Membership=" + Date_of_Membership + "]";
	}

	public void Display() {
		System.out.println("Display :  ");
		System.out.println("Id = " + id + ", Name = " + name + ", Date_of_Membership = " + Date_of_Membership);
	}

}
