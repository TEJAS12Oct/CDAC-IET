package Study.errors.Customs;

public class User {

	public static void main(String[] args) {
		Employee1 E = new Employee1();

		E.setDept("IT");

		try {
			E.setDOB(new MyDate(12, 10, 1940));
		} catch (Under18Exception E1) {
			System.out.println(E1);
		} catch (Above70Exception E1) {
			System.out.println(E1);
		}

		E.setName("RAM");

		System.out.println("Programs Ends Properly");
	}

}
