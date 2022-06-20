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
		do {
			System.out.println("Enter your choice:");
			System.out.println("\t1. update name of a given id\r\n" + "	2. update cost of give id\r\n"
					+ "	3. update both name and cost of given id\r\n" + "	4. delete a record of given\r\n"
					+ "	5. show only the info of row of given id\r\n" + "	6. quit");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				d.updateName(2, "bag");
				d.ShowResultset(d.getRows("select * from product where id=2"));
				break;
			case 2:
				d.updatCost(3, 40000);
				d.ShowResultset(d.getRows("select * from product where id=3"));
				break;
			case 3:
				d.updatNameCost("Extension board", 4, 800);
				d.ShowResultset(d.getRows("select * from product where cost=800"));
				break;
			case 4:
				d.deleteRecord(5);
				d.ShowResultset(d.getRows("select * from product where id=5"));
				break;
			case 5:
				d.givenId(3);
				d.ShowResultset(d.getRows("select * from product where id=3"));
				break;
			case 6:
				System.exit(0);
			}
			sc.close();

		} while (ch != 0);
	}

}
