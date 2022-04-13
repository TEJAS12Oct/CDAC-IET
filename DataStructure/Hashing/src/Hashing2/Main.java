package Hashing2;

public class Main {

	public static void main(String[] args) {

		Hashing hash = new Hashing(15);
		
		
		System.out.println("***********************  Linear Porbing  ********************************");
		hash.insertL("A");
		hash.insertL("DEF");
		hash.insertL("ABL");
		System.out.println("Insert Linear =  " + hash + "\n");

		System.out.println("**********************  Linear Porbing My Way ****************************");
		hash.insertMyWay("DEF");
		hash.insertMyWay("ABL");
		System.out.println("Insert My Way =  " + hash + "\n");

		System.out.println("************************ Quadratic Porbing ******************************");
		hash.insertQ("MNOP");
		hash.insertQ("NO");
		hash.insertQ("ABL");
		System.out.println("Insert Quadratic =  " + hash + "\n");

		System.out.println("************************* Remove Linear Porbing *************************");
//		hash.removeL("A");
		hash.removeL("DEF");
		System.out.println("Remove Linear =  " + hash + "\n");

		System.out.println("************************* Remove Linear Porbing My Way ******************");
		//hash.removeMyWay("AB");
		hash.removeMyWay("DEF");
		System.out.println("Remove My Way =  " + hash + "\n");

		System.out.println("************************** Remove Qudratic Porbing ********************** ");
		hash.removeQ("MNOP");
		System.out.println("Remove Quadratic =  " + hash + "\n");

	}

}
