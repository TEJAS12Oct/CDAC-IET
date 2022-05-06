package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {

//      bucket order of HashMap
		HashMap<Integer, String> HM = new HashMap<Integer, String>();

//      Natural  Ordering Sorted
//		TreeMap<Integer, String> HM = new TreeMap<Integer, String>();

//      order in which we enter element
//		LinkedHashMap<Integer, String> HM = new LinkedHashMap<Integer, String>();
		HM.put(12, "Tejas");
		HM.put(1, "RAM");
		HM.put(12, "SHAM");
		HM.put(20, "NEHA"); // overwrite the earlier value

		Scanner SC = new Scanner(System.in);
//		System.out.println("Enter Number : ");
//		System.out.println("The Name is :" + HM.get(SC.nextInt()));

		Set<Integer> SET = HM.keySet();
		Iterator<Integer> iter = SET.iterator();
		while (iter.hasNext()) {
			int key = iter.next();
			String Value = HM.get(key);
			System.out.println(key + " " + Value);
		}
	}

}
