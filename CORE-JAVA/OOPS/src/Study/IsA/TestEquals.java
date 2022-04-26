package Study.IsA;

//import Study.IsA.MyDate;
import Study.HasA.MyDate;
import Study.HasA.TechnicalBook;

public class TestEquals {

	public static void main(String[] args) {

		/*
		 * MyDate BirthDayOfTejas = new MyDate(12, 12, 2012); // MyDate BirthDayOfRam =
		 * BirthDayOfTejas; MyDate BirthDayOfRam = new MyDate(12, 12, 2021);
		 * 
		 * if (BirthDayOfTejas.equals(BirthDayOfRam)) {
		 * System.out.println(BirthDayOfTejas + " is Same As" + BirthDayOfRam); } else {
		 * System.out.println(BirthDayOfTejas + " is Different As " + BirthDayOfRam); }
		 */

		TechnicalBook TB1 = new TechnicalBook("Core Javaa", 300, new MyDate(12, 12, 2021),
				new String[] { "Ram", "Sham" });
		TechnicalBook TB2 = new TechnicalBook("Core Javaa", 300, new MyDate(12, 12, 2021),
				new String[] { "Ram", "Sham" });
		
		if (TB1.equals(TB2))
			System.out.println("Same");
		else
			System.out.println("Not Same");
	}

}
