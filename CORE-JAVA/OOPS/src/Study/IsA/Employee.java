package Study.IsA;

import Study.IsA.MyDate;

// IS-A relationship Employee Is-A sub class of person
public class Employee extends Person {

	private int EmpID;
	private double salary;
	private String Department;

	public Employee() {
		super();
		System.out.println("Employee Created");
	}

	public Employee(int empID, double salary, String department) {
		super();
		EmpID = empID;
		this.salary = salary; // property me parameter add ho gaya
		Department = department;
		System.out.println("Parameterized Constructor of Employee");
	}

	public Employee(int empID, double salary, String department, String Name, MyDate Dob) {
		super(Name, Dob); // Employee And Person Parameterized Call
		EmpID = empID;
		this.salary = salary; // property me parameter add ho gaya
		Department = department;
		System.out.println("Parameterized Constructor of Employee");
	}

	public int getEmpID() {
		return EmpID;
	}

	public void setEmpID(int empID) {
		EmpID = empID;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public void show() {
//		System.out.println(super.getName() + " " + this.getDOB().getDate());
//		this.show(); // Crash , recursion
		super.show();
		System.out.println(EmpID + " " + salary + " " + Department);
	}
}
