package Q1;

public class Main {

	public static void main(String[] args) {

		LinkList list = new LinkList();

		list.insert(20);
		list.insert(200);
		list.insert(2000);
		System.out.println("Insert = " + list + "\n");

		list.insertByPosition(333, 1);
		System.out.println("Insert By Position = " + list + "\n");

		list.append(10);
		list.append(100);
		list.append(1000);
		System.out.println("Append  = " + list + "\n");

		list.deleteFirst();
		System.out.println("DeleteFirst = " + list + "\n");

		list.deleteLast();
		System.out.println("Delete Last = " + list + "\n");

		list.deleteByPosition(2);
		System.out.println("Delete By Position  = " + list + "\n");

		list.reverse();
		System.out.println("Reverse  = " + list + " \n");

		list.reversePrint();
		
		list.isPalindrome(list);
		

	}

}
