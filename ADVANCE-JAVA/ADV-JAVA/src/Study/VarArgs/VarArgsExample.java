package Study.VarArgs;

public class VarArgsExample {

	public static void main(String[] args) {
		sum(10, 20, 30, 40);
		holidays("June", 2, 24, 26);
	}

	static void sum(int... nums) {
		int total = 0;
		for (int i = 0; i < nums.length; i++) {
			total = total + nums[i];
		}
		System.out.println("Total : " + total);
	}

	static void holidays(String month, int... days) {
		System.out.println("The Holidays for " + month + " , Month Are : ");
		for (int day : days)
			System.out.println(day + " ");
	}
}
