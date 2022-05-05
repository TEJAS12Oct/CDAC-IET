package study;

public class VarArgsExample {

	public static void main(String[] args) {
//		add();
//		add(12);
//		add(12, 13);
//		add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//		add(new int[] { 10, 20, 30 });
		int[] arr = new int[2];
		arr[0] = 90;
		arr[1] = 100;
		add(arr);
	}

	public static void add(int... a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);
	}

}
