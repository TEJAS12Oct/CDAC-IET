package Collection.HW;

import java.util.Iterator;
import java.util.List;

public class BirthdayList {

	public static void addName(List<String> list, String name) {
		list.add(name.toUpperCase());
	}

	public static void removeName(List<String> list, String name) {
		list.remove(name.toUpperCase());
	}

	public static void showGuestList(List<String> list) {
		Iterator<String> iter = list.iterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

	public static boolean haveIadded(List<String> list, String name) {
		if (list.contains(name.toUpperCase())) {
			return true;
		} else {
			return false;
		}
	}

	public static int howManyPeople(List<String> list) {
		int guestNo = list.size();
		return guestNo;
	}

	public static void clearList(List<String> list) {
		list.clear();
	}

}
