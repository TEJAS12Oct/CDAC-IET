package Collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.TreeSet;

public class SetExample1 {
	public static void main(String[] args) {
		TreeSet<Integer> TS = new TreeSet<Integer>();
//		TS.add(45);
//		TS.add(3);
//		TS.add(12);
//		TS.add(1);
//		TS.add(99);
//		TS.add(65);
//		TS.add(78);
//		TS.add(2);
//		TS.add(21);

		Collection<Integer> ints = Arrays.asList(45, 3, 12, 1, 99, 65, 78, 2, 21);
		TS.addAll(ints);

		
		
		for (Integer I : TS)
			System.out.println(I);
	}
}
