package Collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetExample {
	public static void main(String[] args) {

// 		Hashing Order
//		HashSet<Integer> HS = new HashSet<Integer>();

//		Enter / Insertion Ordering
//		LinkedHashSet<Integer> HS = new LinkedHashSet<Integer>();

//		Sorted
		TreeSet<Integer> HS = new TreeSet<Integer>();

		Collection<Integer> ints = Arrays.asList(45, 3, 12, 1, 99, 65, 78, 2, 21);
		HS.addAll(ints);

		for (Integer I : HS)
			System.out.println(I);
	}
}
