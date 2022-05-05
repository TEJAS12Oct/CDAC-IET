package Collection;

import java.util.HashSet;

public class HashSetExample2 {
	public static void main(String[] args) {

		HashSet<Dummy> HS = new HashSet<Dummy>();

		HS.add(new Dummy(12, "AA"));
		HS.add(new Dummy(12, "AA"));
		HS.add(new Dummy(35, "CC"));
		HS.add(new Dummy(7, "DD"));

		for (Dummy D : HS)
			System.out.println(D);
	}
}
