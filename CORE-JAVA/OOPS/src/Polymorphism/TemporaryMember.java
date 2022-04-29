package Polymorphism;

public class TemporaryMember extends Member {

	public int Membership_Fees;

	public TemporaryMember() {
	}

	public TemporaryMember(int membership_Fees) {
		super();
		Membership_Fees = membership_Fees;
	}

	public TemporaryMember(int Membership_Fees, int id, String Name, MyDate date_of_Membership) {
		super(id, Name, date_of_Membership);
		this.Membership_Fees = Membership_Fees;
	}

	public int getMembership_Fees() {
		return Membership_Fees;
	}

	public void setMembership_Fees(int membership_Fees) {
		Membership_Fees = membership_Fees;
	}

	@Override
	public String toString() {
		return "TemporaryMember [Membership_Fees=" + Membership_Fees + ", id=" + id + ", name=" + name
				+ ", Date_of_Membership=" + Date_of_Membership + "]";
	}

	public void Display() {
		super.Display();
		System.out.println("Membership_Fees = " + Membership_Fees);
	}

}
