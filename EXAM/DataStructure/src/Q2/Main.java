/*
Q2. (6 + 6 marks)
Write Java code to sort below array using selection and bubble sorting technique. Each element in the array is object of Number class which holds int value.
{3,5,1,2,34,23,7,89,89,0,4}

*/
package Q2;

public class Main {
	public static void main(String[] args) {
		
		Number no[]=new Number[11];

//		int[] arr = new int[] { 3, 5, 1, 2, 34, 23, 7, 89, 89, 0, 4 };

		Sort S = new Sort();
		
		no[0]=new Number(3);
		no[1]=new Number(5);
		no[2]=new Number(1);
		no[3]=new Number(2);
		no[4]=new Number(34);
		no[5]=new Number(23);
		no[6]=new Number(7);
		no[7]=new Number(89);
		no[8]=new Number(89);
		no[9]=new Number(0);	
		no[10]=new Number(4);

		System.out.print("Display Before Sort = ");
		S.Print(no);
		System.out.println();

		S.SelectionSort(no); // Method Call

		System.out.println("Display After Sort(Selection Sort) = ");
		S.Print(no);
		System.out.println();

		S.BubbleSort(no); // Method Call

		System.out.println("Display After Sort(Bubble Sort) = ");
		S.Print(no);

	} // End of Main
} // End Of Class
