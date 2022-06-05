package Collection.HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class User {

	public static void main(String[] args) {

		ArrayList<String> guest = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);
		char choice;
		do {
			System.out.println("Enter your choice ");
			System.out.println("a.Add Name  ");
			System.out.println("b.Enter Many Names");
			System.out.println("c.Remove name  ");
			System.out.println("d.Show Guest List  ");
			System.out.println("e.Is the name in list ");
			System.out.println("f.Number of guests");
			System.out.println("g.Clear list");
			System.out.println("h.Quit");

			choice = sc.next().charAt(0);

			switch (choice) {
			case 'a': {
				System.out.println("Enter name you want to add in list : ");
				String aname = sc.next();
				BirthdayList.addName(guest, aname);
				
				break;
			}
			case 'b': {
				System.out.println("Enter Many Name : ");
				System.out.println("Enter Comma Seprated");
				String Names = sc.next();
				String[] arrnames = Names.split(",");

				Collections.addAll(guest, arrnames);
//				for (String S : guest)
//					System.out.println(S);

				break;
			}
			case 'c': {
				System.out.println("Enter name you want to remove from list : ");
				String rname = sc.next();
				BirthdayList.removeName(guest, rname);
				break;
			}
			case 'd': {
				System.out.println("Guest List : ");
				BirthdayList.showGuestList(guest);
				break;
			}
			case 'e': {
				System.out.println("Enter the name you want to check in list: ");
				String cname = sc.next();
				boolean flag = BirthdayList.haveIadded(guest, cname);
				if (flag) {
					System.out.println("You have added this name in list!!!");
				} else {
					System.out.println("Name is not in list,you can add!!!");
				}
				break;
			}
			case 'f': {
				int TotalGuests = BirthdayList.howManyPeople(guest);
				System.out.println("Total no.of guests is " + TotalGuests);
			}
			case 'g': {
				BirthdayList.clearList(guest);
				System.out.println("List is cleared!!!");
				break;
			}

			default: {
				System.out.println("Invalid Choice.....!!!");
			}
			}
		} while (choice != 'h');
		sc.close();
	}

}
