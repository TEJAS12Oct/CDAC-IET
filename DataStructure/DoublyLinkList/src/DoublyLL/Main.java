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
		Dll.append(77);
		Dll.append(80);
		System.out.println("Append  = " + Dll + "\n");
		
		Dll.print_forward();
		Dll.print_reverse();

		Dll.deleteFirst();
		System.out.println("\nDelete First = " + Dll + "\n");

		Dll.deleteLast();
		System.out.println("Delete Last = " + Dll + "\n");

		Dll.deleteByPos(3);
		System.out.println("Delete By Position = " + Dll + "\n");
		
		Dll.print_forward();
		Dll.print_reverse();
		
		Dll.even_no();
		Dll.odd_no();

	}

}
