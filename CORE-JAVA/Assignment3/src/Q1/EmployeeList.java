
package Q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeList {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(674, 20000, "dev", "PPP", new MyDate(06, 11, 1996)));
		list.add(new Employee(123, 21000, "dev", "RRR", new MyDate(15, 12, 1991)));
		list.add(new Employee(328, 15000, "dev", "123KKK", new MyDate(27, 9, 1999)));
		list.add(new Employee(856, 35000, "dev", "SSS", new MyDate(31, 7, 1989)));
		list.add(new Employee(021, 28000, "dev", "JJJ", new MyDate(1, 5, 1997)));

		Collections.sort(list, new IDComparator());

		int i = Collections.binarySearch(list, new Employee(328, 15000, "dev", "123KKK", new MyDate(27, 9, 1999)),
				new NameComparator());

		if (i >= 0)
			System.out.println("Employee you are searching for is : \n" + list.get(i));
	}
}

class IDComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getEmpID() < o2.getEmpID())
			return -1;
		if (o1.getEmpID() > o2.getEmpID())
			return 1;
		else
			return 0;
	}

}

class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareToIgnoreCase(o2.getName());
	}

}
