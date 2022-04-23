package Employee;

public class Main {
	public static void main(String[] args) {

		Employee e1 = new Employee("A", 34, 15500); // name, age & salary
		Employee e2 = new Employee("B", 31, 15600);
		Employee e3 = new Employee("C", 32, 15100);
		Employee e4 = new Employee("D", 30, 15500);
		Employee e5 = new Employee("E", 31, 15300);

		EmployeeDLL employeeList1 = new EmployeeDLL();
		employeeList1.insert(e1);
		employeeList1.append(e2);
		employeeList1.insertAtMiddle(e3);

		EmployeeDLL employeeList2 = new EmployeeDLL();
		employeeList2.append(e4);
		employeeList2.insert(e5);
		employeeList2.append("F", 31, 15900);

		System.out.println("Employee List 1 = " + employeeList1);
		System.out.println("\nEmployee List 2 = " + employeeList2);

		employeeList1.append(employeeList2);
		System.out.println("\nEmpL -> 1 Append EmpL -> 2 " + employeeList1);

		employeeList1.deleteOlderThan31Age(); // A delete
		System.out.println("\nDelete Older than  31 = " + employeeList1);

		System.out.println("\nEmployee List 1 = " + employeeList1);
		System.out.println("\nEmployee List 2 = " + employeeList2);
		
		EmployeeDLL.printCommonEmployees(employeeList1, employeeList2);

		EmployeeDLL employeeList3 = EmployeeDLL.concat(employeeList1, employeeList2);
		System.out.println("\nConcat = " + employeeList3);

	}
}
