package Collection;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class EmurationExample {

	public static void main(String[] args) {
//		List<String> List = Arrays.asList("Red", "Green", "White", "Black");

		Vector<String> v = new Vector<String>();
		v.add("Red");
		v.add("Green");
		v.add("Blue");

		System.out.println("Priting With Enumeration .....");
		Enumeration<String> enumer = v.elements();
		while (enumer.hasMoreElements()) {
			System.out.println(enumer.nextElement());
		}
		
		System.out.println("\nPrinting With Iterator");
		Iterator<String> iter = v.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
