package Employee;

public class EmpNode {

	private EmpNode next;
	private EmpNode pre;
	private Employee data;

	public EmpNode() {
		this.next = null;
		this.pre = null;
		this.data = null;
	}

	public EmpNode(String name, int age, int salary) {
		this.next = null;
		this.pre = null;
		this.data = new Employee(name, age, salary);
	}

	public EmpNode(Employee data, EmpNode next, EmpNode pre) {
		this.next = next;
		this.pre = pre;
		this.data = data;
	}

	public EmpNode(Employee data) {
		this.next = null;
		this.pre = null;
		this.data = data;
	}

	public EmpNode(EmpNode next, EmpNode pre) {
		this.next = next;
		this.pre = pre;
		this.data = null;
	}

	public EmpNode(EmpNode next) {
		this.next = next;
		this.pre = null;
		this.data = null;
	}

	public void set_Next(EmpNode next) {
		this.next = next;
	}

	public EmpNode get_Next() {
		return this.next;
	}

	public void set_Pre(EmpNode pre) {
		this.pre = pre;
	}

	public EmpNode get_Pre() {
		return this.pre;
	}

	public void set_Data(Employee data) {
		this.data = data;
	}

	public Employee get_Data() {
		return this.data;
	}

//	public String toString() {
//		String str = " ";
//		str += " " + this.data;
//		return str;
//	}

}
