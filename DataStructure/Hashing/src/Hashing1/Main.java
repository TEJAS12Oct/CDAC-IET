package Hashing1;

public class Main {

	public static void main(String[] args) {

		Hashing hash = new Hashing(10);

		System.out.println("***********************  Linear Porbing  ********************************");
		hash.insertL("ABL");
		hash.insertL("DEF");
		hash.insertL("ABC");
		System.out.println("Insert Linear =  " + hash + "\n");

		System.out.println("************************ Quadratic Porbing ******************************");
		hash.insertQ("MNOP");
		hash.insertQ("NO");
		hash.insertQ("DEF");
		hash.insertQ("ABL");
		System.out.println("Insert Quadratic =  " + hash + "\n");

		System.out.println("************************* Remove Linear Porbing *************************");
		// hash.removeL("XYT");
		// hash.removeL("DEr");
		hash.removeL("ABL");
		System.out.println("Remove Linear =  " + hash + "\n");

		System.out.println("***********************  Linear Porbing  ********************************");
		hash.insertL("ED");
		System.out.println("Insert Linear =  " + hash + "\n");

		System.out.println("************************** Remove Qudratic Porbing ********************** ");
		hash.removeQ("NO");
		System.out.println("Remove Quadratic =  " + hash + "\n");

	}

}
