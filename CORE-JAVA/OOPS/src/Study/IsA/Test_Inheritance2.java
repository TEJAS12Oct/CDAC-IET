package Study.IsA;

public class Test_Inheritance2 {

	public static void main(String[] args) {

		// Alpha Obj = new Beta();
		// Beta Obj = new Theta();

		// Compile Time type of obj is Alpha
		// Obj.FA();
		// Obj.FB();
		// Obj.F1();
		// F1 of Beta Will be Called As run Time type is Beta

		test(new Alpha());
		test(new Beta());
		test(new Theta());
		test(new Gama());
		test(new Delta());
	}

// 	Passing Base Class ,allows all objects of the hierarchy to be Passed
	public static void test(Alpha Obj) {
//		Obj.F1();
//		Obj.FA();
//		obj.FB();  // FB Not Present in Alpha // Error = Unresolved compilation problem obj cannot be resolved

//		if (Obj instanceof Beta)
//			((Beta) Obj).FA();

//		System.out.println("Obj instanceof Beta :");
//		if (Obj instanceof Beta)
//			((Beta) Obj).FB();

//		System.out.println("Obj instanceof Theta");
//		if (Obj instanceof Theta)
//			((Theta) Obj).FC();
	}
}
