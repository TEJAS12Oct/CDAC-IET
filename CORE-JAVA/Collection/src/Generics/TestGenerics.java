package Generics;

public class TestGenerics {

	public static void main(String[] args) {
		Object[] arr = new Object[5];
		arr[0] = 40; // int ==> AutoBoxing INTEGER IS a object;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = "HELLO";

		int Sum = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("Adding : " + arr[i]);
			Sum = Sum + (Integer) arr[i]; // java.lang.ClassCastException =>Unchecked Exception // DownCasting + Unboxing
		}
		System.out.println(Sum);
	}

}
