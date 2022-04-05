/*Modify employee class with addition of employee role also update final salary calculation logic as below:
	   
	if role= Manager
 	totalSalary=baseSalary + (50 % of baseSalary)-(baseSalary/4.25)

	
	if role= Developer
 	totalSalary=baseSalary + (40 % of baseSalary)-(baseSalary/10)

	
	if role= Tester
 	totalSalary=baseSalary + (45 % of baseSalary)-(baseSalary/15)*/

package Employee;

public class Employee1 {

	private int Id;
	private String Name;
	private String Role;
	private int baseSalary;

	public Employee1(int Id, String Name, String Role, int Salary) {
		this.Id = Id;
		this.Name = Name;
		this.baseSalary = Salary;
		this.Role = Role;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setSalary(int salary) {
		baseSalary = salary;
	}

	public int getSalary() {
		return baseSalary;
	}

	public String toString() {
		return ("Employee ID\t: " + Id + "\nEmployee Name:   " + Name + " \nEmployee Basic  Salary: " + (baseSalary)
				+ " Rs\n" + "Total Salary: " + getTotalSalary());
	}

	public float getTotalSalary() {
		float totalSalary = 0;
		System.out.println(getRole());
		if ((getRole().toUpperCase().equals("Manager".toUpperCase()))) {
	//  if ((getRole().equals("Manager")) || (getRole().equals("manager"))) {
			// System.out.println();
			return (totalSalary = ((baseSalary) + (((50 * baseSalary) / 100)) - (baseSalary / 4.25f)));
		}
		if ((getRole().equals("Tester")) || (getRole().equals("tester"))) {
			return (totalSalary = (baseSalary + (((45 * baseSalary) / 100)) - (baseSalary / 150.f)));
		}

		if ((getRole().equals("Developer")) || (getRole().equals("developer"))) {
			return (totalSalary = (baseSalary + ((40 / 100) * baseSalary) - (baseSalary / 100.f)));
		}
		return 0;
	}

}
