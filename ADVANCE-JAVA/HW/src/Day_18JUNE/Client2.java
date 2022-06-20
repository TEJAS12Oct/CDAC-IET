package Day_18JUNE;

import java.util.Scanner;

public class Client2 {
	public static void main(String[] args) {
		DAO2 dao = new DAO2();

		dao.showRows();
		
		System.out.println("\nAdding all the Names In an ArrayList : ");
		dao.ShowNameArrayList();

		System.out.println("\nSize of the ArrayList : ");
		int size = dao.checkSize();
		System.out.println(size);

		
		System.out.println("\nCheck whether name is present in ArrayList or not :");
		
		System.out.println("Enter Name : ");
		Scanner sc = new Scanner(System.in);
		String Name = sc.next();
		
		boolean N = dao.checkName(Name);
		System.out.println(N);

		if (N == false) {
			System.out.println("Name is not present in the arraylist");
		} else {
			System.out.println("Name is present in the arraylist");
		}
	}

}
