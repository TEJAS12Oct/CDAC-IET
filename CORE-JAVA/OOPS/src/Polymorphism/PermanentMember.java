package Polymorphism;

public class PermanentMember extends Member {
	int Discount_Percentage;

	PermanentMember() {
	}

	public PermanentMember(int discount_Percentage) {
		super();
		Discount_Percentage = discount_Percentage;
	}

	public PermanentMember(int discount_Percentage, int id, String name, MyDate date_of_Membership) {
		super(id, name, date_of_Membership);
		Discount_Percentage = discount_Percentage;
	}

	public int getDiscount_Percentage() {
		return Discount_Percentage;
	}

	public void setDiscount_Percentage(int discount_Percentage) {
		Discount_Percentage = discount_Percentage;
	}

	@Override
	public String toString() {
		return "PermanentMember [Discount_Percentage=" + Discount_Percentage + ", id=" + id + ", name=" + name
				+ ", Date_of_Membership=" + Date_of_Membership + "]";
	}

	public void Display() {
//		System.out.println("Display : ");
		super.Display();
		System.out.println("Discount_Percentage = " + Discount_Percentage);
	}

}
