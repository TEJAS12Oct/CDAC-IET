package Study.IsA;

public class Test_Inheritence_3_1 {

	public static void main(String[] args) {

//		Alpha obj = new Beta();
//		Beta obj = new Theta();
//		Theta obj = new Gama();
//		Beta obj = new Delta();
//		Delta obj = new Delta();
		Alpha obj = new Gama();
		obj.FA();
		obj.F1();
//		obj.FB();
//		obj.FC();
//		obj.FD();

	}

}

//										Compile Time DataType    Run Time DataType
//Alpha obj = new Delta();   valid				Alpha				Delta
//Beta obj = new Gama();     valid				Beta 				Gama
//Theta obj = new Delta();   invalid			
//Gama obj = new Theta();    invalid			
//Beta obj = new Delta();    valid				Beta				Delta
//Aplha obj = new Theta()    valid				Alpha				Theta
//Beta obj = new Alpha();    invalid
