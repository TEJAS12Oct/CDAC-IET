package Study.Lambda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamsEx {
	static ArrayList<String> AL = new ArrayList<String>();

	public static void main(String[] args) {

		AL.add("RED");
		AL.add("BLUE");
		AL.add("WHITE");
		AL.add("PINK");
		AL.add("Green");
		AL.add("Orange");
		AL.add("Black");

		AL.stream().forEach((element) -> { // forEach is method of Stram
			System.out.println("This is : " + element);
		});
		
		System.out.println();
		AL.stream().forEach((E) -> {
			System.out.println(E.toUpperCase());
		});

		System.out.println();
		myForEach((el) -> {
			System.out.println("My For Each : " + el);
		});

		System.out.println("\nAfter Filtering : ");

//      select only those element that match a condition and create a new stream

//		  Stream<String> filterdStream = AL.stream().filter((ele) -> { if (ele.length()<= 5) return true; else return false; });
//		  filterdStream.forEach((e) -> { System.out.println(e); });

		System.out.println("\nSmaller Than 5 : ");
		AL.stream().filter((ele) -> {
			if (ele.length() <= 5)
				return true;
			else
				return false;
		}).forEach((e) -> {
			System.out.println(e);
		});
		
		System.out.println("\nGreater Than 5 : ");
		AL.stream().filter((ele) -> {
			if (ele.length() >= 5)
				return true;
			else
				return false;
		}).forEach((e) -> {
			System.out.println(e);
		});

	} // EOM

	static void myForEach(Consumer<String> consumer) {
		for (int i = 0; i < AL.size(); i++) {
			String ele = AL.get(i);
			consumer.accept(ele);
		}
	}
}
