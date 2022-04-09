package DoublyLL;

public class Main {

	public static void main(String[] args) {
		DoublyLL Dll = new DoublyLL();

		Dll.insert(10);
		Dll.insert(20);
		Dll.insert(30);
		Dll.insert(40);
		System.out.println("Insert = " + Dll + "\n");

		Dll.append(50);
		Dll.append(60);
		Dll.append(70);
		Dll.append(80);
		System.out.println("Append  = " + Dll+ "\n");

		Dll.deleteFirst();
		Dll.deleteFirst();
		System.out.println("Delete First = " + Dll+ "\n");

		Dll.deleteLast();
		System.out.println("Delete Last = " + Dll+ "\n");

		Dll.deleteByPos(3);
		System.out.println("Delete By Position = " + Dll+ "\n");

		Dll.reverseprint();

	}

}
