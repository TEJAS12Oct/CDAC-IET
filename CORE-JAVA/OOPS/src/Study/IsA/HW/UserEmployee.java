package Study.IsA.HW;

public class UserEmployee {

	public static void main(String[] args) {
		PartTimeEmployee E = new PartTimeEmployee(8, "ICU", 10000, 57);
		System.out.println(E);
		PartTimeEmployee E2 = new PartTimeEmployee(10, "EYE DEPT", 80000, 75, "GGGGGGGGG", new MyDate(12, 12, 2012));
		System.out.println(E2);
		System.out.println(E2.getName() + E2.getWorkHour() + E2.Department);

	}

}
