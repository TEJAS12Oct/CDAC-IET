package Int;

public class Main {

	public static void main(String[] args) {

//		Node head = new Node(11);
////		Node n2 = new Node(22);
////		head.next = n2;
//
//		head.next = new Node(22);
//		head.next.next = new Node(33);
//		head.next.next.next = new Node(44);
//		
//		System.out.println(head.data + " ," +
//						   head.next.data + " , " + 
//				           head.next.next.data);

		LinkList list = new LinkList();
		list.append(10);
		list.insert(20);
		list.append(100);
		list.insert(200);
		list.append(1000);
		list.insert(2000);
		
		System.out.println(list);
		
		list.deleteFirst();
		list.deleteLast();
		
		System.out.println(list);
	}

}
