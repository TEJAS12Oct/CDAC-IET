package study.scope_1;

import study.scopes.Alpha;

public class Gama {

	public static void Test3() {

		Alpha A3 = new Alpha();
//		A3.data = 100;   // data is private cannot be accessed in another class
//		A3.data2 = 100;  // data2 is default scope ,so not available in Outside package 
		A3.data3 = 100; // data3 is public

//	    A3.Show1();      // Method(Show1) is private cannot be accessed in another class
//	    A3.Show2();     // data2(Show2) is default scope ,so not available in Outside package
		A3.Show3(); 	// method(Show3) is public
	}
}
