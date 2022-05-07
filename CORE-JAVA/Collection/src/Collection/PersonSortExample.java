package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PersonSortExample {

	public static void main(String[] args) {
		ArrayList<Person> AL = new ArrayList<Person>();
		AL.add(new Person("Tejas", 1, new MyDate(12, 10, 2022)));
		AL.add(new Person("RAM", 15, new MyDate(2, 2, 2020)));
		AL.add(new Person("RAM", 25, new MyDate(3, 1, 2020)));
		AL.add(new Person("PANKAJ", 4, new MyDate(4, 1, 2021)));
		AL.add(new Person("ANIKET", 27, new MyDate(24, 12, 2014)));

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter => 1  for for Name Ordering , 2 for DOB Ordering");
//		int X = sc.nextInt();
//		
//		if (X == 1) {
//			Collections.sort(AL);
//		} else {
//			Collections.sort(AL, new DOBComparator());
//		}

//		Collections.sort(AL, new IDComparator());
		
		Collections.sort(AL);

		for (Person P : AL) {
			System.out.println(P);
		}
//		sc.close();

	} // EOM
} // EOC

class DOBComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getDob().compareTo(o2.getDob());
	}

}

//class IDComparator implements Comparator<Person> {
//
//	@Override
//	public int compare(Person o1, Person o2) {
//
//		if (o1.getId() > o2.getId())
//			return 1;
//		if (o1.getId() < o2.getId())
//			return -1;
//		else
//			return 0;
//	}
//
//}