// Find SinglyLL Has A Cycle or not , if yes , Detect it and Remove it
package Q2;

public class Main {

	public static void main(String[] args) {
		DetectCycleList list = new DetectCycleList();

		list.insert_last(1);
		list.insert_last(2);
		list.insert_last(3);
		list.insert_last(4);
		list.insert_last(5);
		list.insert_last(6);
		list.insert_last(7);
		System.out.println("Insert Last = " + list);

		list.insert_cycle(3);
		System.out.println("Insert Cycle = " + list);

		Node C = list.FindCycle();
		System.out.println("CYCLE DETECTED : " + list);

		int length = list.lengthList(C);
		Node it = list.head;
		for (int i = 1; i < length; i++) {
			it = it.next;
		}
		System.out.println("Length = " + length);

	}
}
