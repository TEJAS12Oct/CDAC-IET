package study.scopes;

public class Alpha {

	private int data; // access only in same class (Aplha) , not access in another class
	int data2;
	public int data3;

	public static void Test1() {
		Alpha A1 = new Alpha();
		A1.data = 300;
		A1.data2 = 300;
		A1.data3 = 300;

		A1.Show1();
		A1.Show2();
		A1.Show3();
	}

	private void Show1() {

	}

	void Show2() {

	}

	public void Show3() {

	}

}
