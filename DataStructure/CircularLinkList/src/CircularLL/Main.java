package CircularLL;

public class Main {

	public static void main(String[] args) {

		CircularLL Cll = new CircularLL();

		Cll.insert(10);
		Cll.insert(15);
		Cll.insert(25);
		System.out.println("Insert  = " + Cll);

		Cll.append(35);
		Cll.append(30);
		Cll.append(40);
		System.out.println("Append  = " + Cll);

		Cll.InsertByPosition(3, 45);
		System.out.println("Insert By Poition = " + Cll);

		Cll.DeleteFirst();
		System.out.println("Delete First  = " + Cll);

		Cll.DeleteLast();
		System.out.println("Delete Last = " + Cll);

		Cll.DeleteByPosition(3);
		System.out.println("Delete By Position = " + Cll);

	}

}
