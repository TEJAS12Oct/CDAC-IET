package study;

public class EqualsExample {

	public static void main(String[] args) {

		Dummy2 Obj1 = new Dummy2(12, "Tejas");
//		Dummy2 Obj2 = Obj1;
		Dummy2 Obj2 = new Dummy2(12, "Tejas");

		System.out.println("Equals Result :" + Obj1.equals(Obj2));
		System.out.println("Hashcode Of Obj1 :" + Obj1.hashCode());
		System.out.println("Hashcode Of Obj2 :" + Obj2.hashCode());
	}

}

class Dummy2 {
	private int RollNo;
	private String Name;

	Dummy2() {
	}

	public Dummy2(int rollNo, String name) {
		super();
		RollNo = rollNo;
		Name = name;
	}

	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public int hashCode() {

		return RollNo; // According to rules RollNo are unique
	}

	@Override
	public boolean equals(Object obj) {
		Dummy2 Temp = (Dummy2) obj;
		if (Temp.RollNo == this.RollNo && Temp.Name.equals(this.Name))
			return true;
		else
			return false;
	}
}