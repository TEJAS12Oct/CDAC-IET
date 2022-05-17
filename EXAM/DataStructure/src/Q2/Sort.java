package Q2;

public class Sort {
	public void SelectionSort(Number[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int j = i;
			Number x = arr[j];
			while (j < arr.length) {
				if (arr[j].getValue() < x.getValue()) {
					Number tmp = arr[j];
					arr[j] = x;
					x = tmp;
				}
				j++;
			}
			arr[i] = x;
		}

	}

	public void BubbleSort(Number[] arr) {
		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i + 1].getValue() < arr[i].getValue()) {
					Number tmp = arr[i]; // Swap Element
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;

				}
			} // End Of Loop
		} // End of Loop
	}

	public void Print(Number[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ,");
		}
		System.out.println();

	}

} // End of Class
