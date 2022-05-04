package Study.IsA;

public class UseOfHierarchy {

	public static void main(String[] args) {

		/*
		 * Employee E = new Employee();
		 * 
		 * // Employee has inherited setName, getName , setDOB ,getDOB In Person
		 * E.setName("Tejas"); E.setDOB(new MyDate(12, 10, 2021));
		 * 
		 * // Employee has own Method E.setEmpID(12); E.setSalary(2500000);
		 * E.setDepartment("IT");
		 * 
		 * System.out.println("The name of The employee is = " + E.getName());
		 * System.out.println("The employee Department : " + E.getDepartment());
		 */

		Employee E1 = new Employee(12, 250000, "Testing");
		System.out.println(E1.getName() + " , " + E1.getDepartment() + "\n");

		Employee E2 = new Employee(12, 250000, "Testing", "Sham", new MyDate(25, 4, 2022));
		System.out.println(E2.getName() + " , " + E2.getDepartment() + "\n");

		Employee E3 = new Employee(19, 300000, "Production", "RAM", new MyDate(3, 3, 2023));
//		System.out.println(E3.getName() + " , " + E3.getDOB());
		E3.show();
	}
}