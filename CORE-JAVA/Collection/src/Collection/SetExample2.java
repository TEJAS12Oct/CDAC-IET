package Collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class SetExample2 {
// Only PreOrder  // TreeHashSet
	public static void main(String[] args) {

//		TreeSet<Dummy> TS = new TreeSet<Dummy>();
		TreeSet<Dummy> TS = new TreeSet<Dummy>(new IDOrdering());

		TS.add(new Dummy(1, "AA"));
		TS.add(new Dummy(12, "BB"));
		TS.add(new Dummy(35, "CC"));
		TS.add(new Dummy(7, "DD"));

		for (Dummy D : TS)
			System.out.println(D);
		
		

	}

}

class Dummy implements Comparable<Dummy> {
	private int ID;
	private String Name;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Dummy(int ID, String Name) {
		this.ID = ID;
		this.Name = Name;
	}

	@Override
	public int hashCode() {
		String X = ID + Name;
		return X.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Dummy D = (Dummy) obj;

		if (D.ID == this.ID && D.Name.equals(this.Name))
			return true;
		else
			return false;

	}

	@Override
	public String toString() {
		return ID + " , " + Name;
	}

	@Override
	public int compareTo(Dummy o) {

		return Name.compareTo(o.Name);
	}
}

class IDOrdering implements Comparator<Dummy> {

	@Override
	public int compare(Dummy o1, Dummy o2) {
		if (o1.getID() > o2.getID())
			return 1;
		if (o1.getID() < o2.getID())
			return -1;
		else
			return 0;
	}

}