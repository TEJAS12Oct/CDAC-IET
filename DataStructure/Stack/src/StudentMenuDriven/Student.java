package StudentMenuDriven;
public class Student {
	private String name;
	private int age;
	private char gender;
	
	
	public Student(String n,int a,char g) {
		this.name=n;
		this.age=a;
		this.gender=g;
	}
	

	
	public String toString() {
		
		String str=this.name+ "\t  " + this.age + "\t "+ this.gender;
		return str ;
	}


	public String getName() {
		return this.name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return this.age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public char getGender() {
		return this.gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}
}
