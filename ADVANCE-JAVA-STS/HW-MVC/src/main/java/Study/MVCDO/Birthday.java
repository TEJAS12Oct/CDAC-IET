package Study.MVCDO;


public class Birthday {

	String FName, Lname;
	String DOB;
	int id;

	public Birthday() {
	
	}
	
	

	public Birthday(String fName, String lname) {
		super();
		FName = fName;
		Lname = lname;
	}



	public Birthday(int id) {
		this.id = id;
	}

	public Birthday(String fName, String lname, String dOB, int id) {
		super();
		FName = fName;
		Lname = lname;
		DOB = dOB;
		this.id = id;
	}

	public String getFName() {
		return FName;
	}

	public void setFName(String fName) {
		FName = fName;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
