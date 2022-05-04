package Study.IsA;

public class Test_Inheritance_Concepts {

	public static void main(String[] args) {

//		Alpha obj = new Alpha();
//		Beta obj = new Beta();
//		Theta obj = new Theta();
		Gama obj = new Gama();
//		Delta obj = new Delta();

		obj.FA();
		obj.FB();
		obj.FC();
		obj.FD();

		DoJob1(new Alpha()); // Alpha Obj = new Alpha();
		DoJob1(new Beta()); // Alpha obj = new Beta();
		DoJob1(new Theta()); // Alpha obj = new Theta();
		DoJob1(new Gama()); // Alpha obj = new Gama();
		DoJob1(new Delta()); // Alpha obj = new Delta();

		DoJob2(new Beta()); // Beta obj = new Beta();
		DoJob2(new Theta()); // Beta obj = new Theta();
		DoJob2(new Gama()); // Beta obj = new Gama();
		DoJob2(new Delta()); // Beta obj = new Delta();

		DoJob3(new Theta()); // Theta obj = new Theta();
		DoJob3(new Gama()); // Theta obj = new Gama();

		DoJob4(new Gama()); // Gama obj = new Gama();

		DoJob5(new Delta()); // Delta obj = new Delta();

	} // END OF MAIN

	public static void DoJob1(Alpha obj) {
		obj.FA();
//		obj.FB();
//		obj.FC();
//		obj.FD();
	}

	public static void DoJob2(Beta obj) {
		obj.FA();
		obj.FB();
//		obj.FC();
//		obj.FD();
	}

	public static void DoJob3(Theta obj) {
		obj.FA();
		obj.FB();
		obj.FC();
//		obj.FD();
	}

	public static void DoJob4(Gama obj) {
		obj.FA();
		obj.FB();
		obj.FC();
		obj.FD();
	}

	public static void DoJob5(Delta obj) {
		obj.FA();
		obj.FB();
//		obj.FC();
//		obj.FD();
	}

} // END OF CLASS TEST_INHERITANCE_CONCEPTS

class Alpha {
	void FA() {
		System.out.println("Alpha");
	}

	void F1() {
		System.out.println("F1 Of Aplha");
	}
}

class Beta extends Alpha {
	void FB() {
		System.out.println("Beta");
	}

	void F1() {
		System.out.println("F1 Of Beta");
	}
}

class Theta extends Beta {
	void FC() {
		System.out.println("Theta");
	}

	@Override
	void F1() {
		System.out.println("F1 Of Theta");
	}
}

class Gama extends Theta {
	void FD() {
		System.out.println("Gama");
	}

}

class Delta extends Beta {

}
//										Compile Time DataType    Run Time DataType
// Aplha obj = new Delta();   valid				Alpha				Delta
// Beta obj = new Gama();     valid				Beta 				Gama
// Theta obj = new Delta();   invalid			
// Gama obj = new Theta();    invalid			
// Beta obj = new Delta();    valid				Beta				Delta
// Aplha obj = new Theta()    valid				Alpha				Theta
// Beta obj = new Alpha();    invalid
