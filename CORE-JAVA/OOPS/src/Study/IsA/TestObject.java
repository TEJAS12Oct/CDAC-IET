package Study.IsA;

import Study.HasA.SplitDemo;
import Study.HasA.MyDate;

public class TestObject {

	public static void main(String[] args) {

		MyDate Date = new MyDate(12, 12, 2021);
//		Date.
		System.out.println(Date);
		System.out.println(new MyDate(13, 13, 3031));

		Employee E = new Employee();
//		E.

		Person P = new Person();
//      P.

	}

}
