package EmployeeQueueLL;

public class Main {

	public static void main(String[] args) {

		Employee E1 = new Employee("Tej", 1, 'M');
		Employee E2 = new Employee("RAj", 2, 'M');
		Employee E3 = new Employee("yash", 3, 'M');
		Employee E4 = new Employee("Dada", 4, 'M');
		QueueLL Qll = new QueueLL();

		Qll.insert(E1);
		Qll.insert(E2);
		Qll.insert(E3);
		Qll.insert(E4);
		System.out.println(Qll);

		Qll.Remove();
		System.out.println(Qll);
	}

}
