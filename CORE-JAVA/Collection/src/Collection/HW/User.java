package Collection.HW;

import java.util.ArrayList;
import java.util.Scanner;

public class User {

	public static void main(String[] args) {

		ArrayList<String> guest = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);
		char choice;
		do {
			System.out.println("Enter your choice ");
			System.out.println("a.Add Name  ");
			System.out.println("b.Remove name  ");
			System.out.println("c.Show Guest List  ");
			System.out.println("d.Is the name in list ");
			System.out.println("e.Number of guests");
			System.out.println("f.Clear list");
			System.out.println("g.Quit");

			choice = sc.next().charAt(0);

			switch (choice) {
			case 'a': {
				System.out.println("Enter name you want to add in list : ");
				String aname = sc.next();
				BirthdayList.addName(guest, aname);
				break;
			}
			case 'b': {
				System.out.println("Enter name you want to remove from list : ");
				String rname = sc.next();
				BirthdayList.removeName(guest, rname);
				break;
			}
			case 'c': {
				System.out.println("Guest List : ");
				BirthdayList.showGuestList(guest);
				break;
			}
			case 'd': {
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
			case 'e': {
				int TotalGuests = BirthdayList.howManyPeople(guest);
				System.out.println("Total no.of guests is " + TotalGuests);
			}
			case 'f': {
				BirthdayList.clearList(guest);
				System.out.println("List is cleared!!!");
				break;
			}
			default: {
				System.out.println("Invalid Choice.....!!!");
			}
			}
		} while (choice != 'g');
		sc.close();
	}

}
