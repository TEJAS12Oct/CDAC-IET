package RoughWork;

public class Main {

	public static void main(String[] args) {
		Employee e = new Employee(1, "TEJAS", 45000);
		System.out.println(e.getid());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
		System.out.println(e);
		
		e.setid(2);
		e.setName("jawale");
		e.setSalary(75000);
		System.out.println(e.getid());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
		//e.display();
		System.out.println(e);
	}

}
