package study.Wrapper;

public class Example1 {

	static int x = 1;
	static int y = 2;

	public static void main(String[] args) {

// Wrapper  Class => Primitive DatType Convert Into Object ,
// Object Convert Primitive DataType		

// Wrapper  Class = Integer , CHracter <Float , Long , Boolean		
		
		Integer obj = new Integer(34); // Wrap 34 into obj , Boxing , //explicitly
		Integer obj2 = 44; // AutoBoxing  //Implicitly
		int I = obj; // UnBoxing , Value in Object Is Assigned To x

		Character Chobj = new Character('T'); // Boxing
		Character Chobj2 = 'W'; // AutoBoxing
		char ch = Chobj; // unboxing

		Float f = new Float(3.14f);
		Float F2 = 3.14f;
		float F = f;

		Long L = new Long(1233232456);
		Long L1 = 113332236666666666L;
		long l = L;

		Boolean flag = false; // AutoBoxing
		boolean flag1 = true; // Primitive

	}

}
