package Basic;

public class SumOFNaturalNo {

	public static void main(String[] args) {

		int num = 10, sum = 0;
		for (int i = 1; i <= num; ++i) {
			sum = sum + i;
		}
		System.out.println("Sum of First "+ num +" Natural Numbers is = " + sum);
	}
}