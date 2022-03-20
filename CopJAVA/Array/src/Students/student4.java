package Students;

public class student4 {
	private String name;
	private int age;
	private char gender;
	
	
	public student4(String n,int a,char g) {
		name=n;
		age=a;
		gender=g;
	}
	

	/*void print()
	{
		 if(name.isEmpty())	
		System.out.println(age + ", "+ gender);
		 else
		System.out.println(name + ", " + age + ", "+ gender);
	}
	*/
	
	public String toString() {
		
		String str=name+ "\t  " + age + "\t "+ gender;
		return str ;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}

}
