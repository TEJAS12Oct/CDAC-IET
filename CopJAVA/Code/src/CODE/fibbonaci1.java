package CODE;

public class fibbonaci1 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.println("FIBBONACCI: " + fibbo(i));
		}
	}

	public static int fibbo(int num) {
		if (num == 1)
			return 1;
		if (num == 0)
			return 0;
		else
			return fibbo(num - 1) + fibbo(num - 2);
	}

}
