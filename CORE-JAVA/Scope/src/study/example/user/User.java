package study.example.user;

import study.example.Delta;

public class User {

	public static void Test3() {

	}

	public static void main(String[] args) {

		Delta D1 = new Delta(); 		// public Constructor is visible in Another package
//		Delta D2 = new Delta("Tejas"); // private Constructor is not visible in Another package 
//		Delta D3 = new Delta(12);      // default construtor is not visible in Another package 

		Test3();
	}

}
