package Employee;

public class Main {

	public static void main(String[] args) {
		Employee E = new Employee();

		Employee E1 = new Employee("Tejas", 4, 45000);
		Employee E2 = new Employee("Ram", 1, 45000);
		Employee E3 = new Employee("Shyam", 5, 45000);
		Employee E4 = new Employee("sahil", 2, 45000);
		Employee E5 = new Employee("yash", 6, 45000);
		Employee E6 = new Employee("Aniket", 3, 45000);

		EmpLinklist list = new EmpLinklist();

		list.append(E1);
		list.insert(E2);
		list.append(E3);
		list.insert(E4);
		list.append(E5);
		list.insert(E6);

		System.out.println(list);

		list.deleteFirst();
		list.deleteLast();

		System.out.println(list);
	}

}
