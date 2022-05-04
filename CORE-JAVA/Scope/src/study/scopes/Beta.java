package study.scopes;

public class Beta {
	
	public static void Test2() {
		
		Alpha A2 = new Alpha();
//		A2.data = 200;   // private data is not available outside class
		A2.data2 = 200;  // data2 is default cope ,so available in same package
	    A2.data3 = 300;  // data3 is public
	    
//      A2.Show1();   // private Method(Show1) is not available outside class	   
	    A2.Show2();   // method(Show2) is default scope ,so available in same package
	    A2.Show3();   // method(Show3) is public
	}
}
