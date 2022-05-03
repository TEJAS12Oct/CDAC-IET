package Study.errors.Customs;

public class Employee1 {

	private String Dept, Name;
	private MyDate DOB;

	Employee1() {

		DOB = new MyDate();
	}

	public Employee1(String dept, String name, MyDate dOB) {
		super();
		Dept = dept;
		Name = name;
		DOB = dOB;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public MyDate getDOB() {
		return DOB;
	}

	public void setDOB(MyDate dOB) throws Under18Exception, Above70Exception {// throws Above70Exception { // Only
		// System.out.println(DOB.getYear()); // Declare Here
		if ((2022 - dOB.getYear()) >= 18 && (2022 - dOB.getYear()) < 70) {
			this.DOB = dOB;
		} else if ((2022 - dOB.getYear()) < 18) {
			throw new Under18Exception();

		} else {
			throw new Above70Exception();
		}

	}

}
