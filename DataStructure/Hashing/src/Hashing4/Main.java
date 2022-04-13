package Hashing4;

public class Main {

	public static void main(String[] args) {

		Hashing hash = new Hashing(10);

		System.out.println("***********************  Linear Porbing  ********************************");
		hash.insertL("ABL");
		hash.insertL("DEF");
		hash.insertL("ABC");
		System.out.println("Insert Linear =  " + hash + "\n");

		System.out.println("************************* Remove Linear Porbing *************************");
		hash.removeL("ABL");
		hash.removeL("TSJ");
		System.out.println("Remove Linear =  " + hash + "\n");

	}

}
