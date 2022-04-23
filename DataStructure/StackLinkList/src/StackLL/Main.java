package StackLL;

public class Main {

	public static void main(String[] args) {

		StackLL Sll = new StackLL();

		Sll.push(20);
		Sll.push(200);
		Sll.push(2000);

		System.out.println(Sll);

		Sll.pop();
		Sll.pop();
		System.out.println(Sll);
	}

}
