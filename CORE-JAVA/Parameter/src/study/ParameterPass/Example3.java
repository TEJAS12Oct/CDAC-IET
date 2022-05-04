package study.ParameterPass;

public class Example3 {

	public static void main(String[] args) {
		int[] arr = { 100, 200 };

		System.out.println("before arr[0]=" + arr[0] + " arr[1]=" + arr[1]);
		increment(arr);
		System.out.println("after arr[0]=" + arr[0] + " arr[1]=" + arr[1]);
	}

	public static void increment(int[] arr) {
		arr[0]++;
		arr[1]++;
	}

}