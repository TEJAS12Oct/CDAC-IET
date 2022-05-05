package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class TestList {
	public static void main(String[] args) {

//		ArrayList<String> AL = new ArrayList<String>();
//		LinkedList<String> AL = new LinkedList<String>();
//		Stack<String> AL = new Stack<String>();
		Vector<String> AL = new Vector<String>();
		AL.add("RED");
		AL.add("YELLOW");
		AL.add("BLUE");
		AL.add("ORANGE");

		for (int i = 0; i < AL.size(); i++) {
			System.out.println(AL.get(i));
		}
	}

}
