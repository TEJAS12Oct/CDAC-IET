package Day_18JUNE;

import java.sql.ResultSet;
import java.util.Scanner;

/*
 1. Write a Java client that gives following Menu
	Do it using study.hw.DAO + PrepareStatement 
	Write main class as study.hw.Client3

	1. update name of a given id
	2. update cost of given id
	3. update both name and cost of given id
	4. delete a record of given
	5. show only the info of row of given id
	6. quit
 */

public class Client1 {
	public static void main(String[] args) {
		DAO1 d = new DAO1();
		ResultSet rs = d.getRows("Select * from product");
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		d.ShowResultset(d.getRows("select * from product"));
		do {
			System.out.println("\nEnter your choice:");
			System.out.println("\t1. update name of a given id\r\n" + "	2. update cost of give id\r\n"
					+ "	3. update both name and cost of given id\r\n" + "	4. delete a record of given\r\n"
					+ "	5. show only the info of row of given id\r\n" + "	6. quit");
			ch = sc.nextInt();
			switch (ch) {
			case 1: {

				System.out.println("Enter ID Which you want to  Update :");
				int id = sc.nextInt();

				System.out.println("Enter Name  Which you want to  Update : ");
				String Name = sc.next();

				d.updateName(id, Name);
				d.ShowResultset(d.getRows("select * from product where id=" + id));
				System.out.println("Update Name  Successfully...!!!");
				break;
			}
			case 2: {
				System.out.println("Enter ID Which you want to  Update :");
				int id = sc.nextInt();

				System.out.println("Enter Cost Which you want to  Update :");
				int Cost = sc.nextInt();
				d.updatCost(id, Cost);
				d.ShowResultset(d.getRows("select * from product where id=" + id));
				System.out.println("Update  COst Successfully...!!!");
				break;
			}
			case 3: {
				System.out.println("Enter ID Which you want to  Update :");
				int id = sc.nextInt();

				System.out.println("Enter Name  Which you want to  Update : ");
				String Name = sc.next();

				System.out.println("Enter Cost Which you want to  Update :");
				int Cost = sc.nextInt();

				d.updatNameCost(id, Name, Cost);

				d.ShowResultset(d.getRows("select * from product where id=" + id));
				System.out.println("Update Name And COst Successfully...!!!");
				break;
			}
			case 4: {
				System.out.println("Enter ID Which you want to  Update :");
				int id = sc.nextInt();

				d.deleteRecord(id);
				d.ShowResultset(d.getRows("select * from product where id=" + id));
				System.out.println("Deleted Succesfully...!!!");
				break;
			}
			case 5: {

				System.out.println("Enter The Id of Product Whoose Info Want To Display");
				sc.nextLine();
				int id = sc.nextInt();
				d.givenID(id);
				d.ShowResultset(d.givenID(id));
				break;
			}

			case 6:
				System.exit(0);
			}

		} while (ch != 0);
	}

}
