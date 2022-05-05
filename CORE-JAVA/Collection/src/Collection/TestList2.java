package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class TestList2 {
	public static void main(String[] args) {

//		ArrayList<String> AL = new ArrayList<String>();
//		LinkedList<String> AL = new LinkedList<String>();
//		Stack<String> AL = new Stack<String>();
		Vector<String> AL = new Vector<String>();
		AL.add("RED");
		AL.add("YELLOW");
		AL.add("BLUE");
		AL.add("ORANGE");

//		showElements(AL);
//		showElements2(AL);
		showElements3(AL);

		AL.remove(1); // remove by index
//		AL.remove("BLUE"); // Removing by Matching Object
		System.out.println("\nAfter Removing");
		System.out.println(AL);
	}

	public static void showElements(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public static void showElements2(List<String> list) {
		for (String S : list) {
			System.out.println(S);
		}
	}

	private static void showElements3(List<String> list) {
		Iterator<String> iter = list.iterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
