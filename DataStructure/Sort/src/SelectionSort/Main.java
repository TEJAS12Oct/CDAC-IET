package SelectionSort;

public class Main {

	public static void main(String[] args) {
		int [] arr =  new  int[] { 12 , 75 , 30 , 93 , 48 , 3 };
		 
		 Sort s = new Sort();
		 
		 s.print(arr);
		 s.selectionAscending(arr);
		 s.print(arr);
		 s.selectionDecending(arr);
		 s.print(arr);
	}

}
