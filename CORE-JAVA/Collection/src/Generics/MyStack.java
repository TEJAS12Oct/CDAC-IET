package Generics;
// Formal type Parameter => PlaceHolder
public class MyStack<T> {
	
	private T[] arr;
	private int top = -1;

	public MyStack(T[] arr) {
		this.arr = arr;
	}

	public void push(T obj) {
		top++;
		arr[top] = obj;
	}

	public T pop() {
		return arr[top--];
	}

	public void show() {
		for (T obj : arr)
			System.out.println(obj);

	}

}
