/*
Q3)Remove Duplicates from an array
1.
• create a target array and keep orginal array as it is
2.
change the original array and remove duplicates
int arr[]={12,34,12,12, 34,54,12,10,55,51};

*/
package Array1D;

public class Q3 {

	public static void main(String[] args) {
		int arr[] = { 12, 34, 12, 12, 34, 54, 12, 10, 55, 51 };
		int tar[];
		tar = new int[20];
		int i, j = 0;
		int tar_index = -1;
		int flag = 0;
		for (i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();
		for (i = 0; i < arr.length; i++) {
			flag = 0;
			for (j = 0; j <= tar_index; j++) {
				if (arr[i] == tar[j]) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				tar_index = tar_index + 1;
				tar[tar_index] = arr[i];
			}
		}
		for (j = 0; j < tar_index + 1; j++) {
			System.out.print(" " + tar[j]);
		}
	}

}
