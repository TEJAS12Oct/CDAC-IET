package study.example;

public class Theta {

	public static void Test2() {

	}

	public static void main(String[] args) {

		Delta D1 = new Delta();         // public Constructor is Access Same package
//		Delta D2 = new Delta("Tejas");  // private Constructor is not visible in same package and outside class 
		Delta D3 = new Delta(12);       // Default Constructor is Access in same package

		Test2();
	}

}
