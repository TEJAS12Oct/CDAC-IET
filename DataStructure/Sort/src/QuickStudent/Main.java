package QuickStudent;

public class Main {

	public static void main(String[] args) {

		Student[] arr = new Student[5];

		Student Q1 = new Student("Tejas", 22, 'M', 340);
		Student Q2 = new Student("Aniket", 25, 'M', 370);
		Student Q3 = new Student("Roshan", 27, 'M', 400);
		Student Q4 = new Student("Nishant", 20, 'M', 300);
		Student Q5 = new Student("Sahil", 24, 'M', 335);

		arr[0] = Q1;
		arr[1] = Q2;
		arr[2] = Q3;
		arr[3] = Q4;
		arr[4] = Q5;

		QuickSort QS = new QuickSort();

		System.out.print("Original Array = \n");
		QS.print(arr);

		QS.QuickS(arr, 0, arr.length - 1);
		System.out.print("AGE  Quick Sort =  \n");
		QS.print(arr);

		QS.QSort(arr, 0, arr.length - 1);
		System.out.print("Marks Quick Sort =  \n");
		QS.print(arr);

	}

}
