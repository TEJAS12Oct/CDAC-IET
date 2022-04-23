package BinarySearchEx;

public class myClass {

	static int[] input = new int[] { 31, 35, 40, 42, 50, 66, 69, 69, 70, 70, 70, 78, 78, 85, 85, 88, 90, 90 };

	public static int count(int key) {
		int low, high, cnt, mid;
		low = 0;
		high = input.length - 1;

		mid = (low + high) / 2;
		cnt = 0;
		while ((input[mid] != key) && (low < high)) {
			if (key < input[mid])
				high = mid - 1;
			else
				low = mid + 1;
			mid = (low + high) / 2;

		}
		if (input[mid] == key) {
			cnt = cnt + 1;
			low = mid - 1;
			;
			while (input[low] == key) {
				cnt = cnt + 1;
				low = low - 1;

			}

			high = mid + 1;
			while (input[high] == key) {
				cnt = cnt + 1;
				high = high + 1;

			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		System.out.println(count(70) + " , Student");
	}

}
