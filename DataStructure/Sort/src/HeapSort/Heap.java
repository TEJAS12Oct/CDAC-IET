package HeapSort;

public class Heap {

	public void HeapSort(int[] arr) {
		int n = arr.length;

		// Build max heap
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(arr, n, i);
		}

		// Heap sort
		for (int i = n - 1; i >= 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			// Heapify root element
			heapify(arr, i, 0);
		}
	}

	private void heapify(int[] arr, int len, int i) {
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		if (l < len && arr[l] > arr[i])
			largest = l;

		if (r < len && arr[r] > arr[largest])
			largest = r;

		if (largest != i) {
			int tmp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = tmp;

			heapify(arr, len, largest);

		}

	}

	public void print(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
