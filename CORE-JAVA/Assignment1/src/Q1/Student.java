package Q1;

import java.util.Calendar;

public class Student 
{
	private String firstName;
	private String lastName;
	private int age;
	private int gradYear;
	private String gradStream;
	
	public Student()
	{
		this.firstName = null;
		this.lastName = null;
		this.age = 0;
		this.gradYear = 1900;
		this.gradStream = null;
	}
	
	public Student(String firstName, String lastName, int age, int gradYear, String gradStream) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gradYear = gradYear;
		this.gradStream = gradStream;
	}

	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName(String firstName)
	{
		if(firstName != null && firstName.length() != 0)
			this.firstName = firstName;
		
		else
			System.out.println("First name cannot be empty..");
	}
	
	public String getLastName() 
	{
		return lastName;
	}
	
	public void setLastName(String lastName) 
	{
		if(lastName != null && lastName.length() != 0)
			this.lastName = lastName;
		
		else
			System.out.println("Last name cannot be empty..");	
	}
	
	public int getAge() 
	{
		return age;
	}
	
	public void setAge(int age) 
	{
		if(age>=18 && age <= 80)
			this.age = age;
		else
			System.out.println("age must be in between 18 to 80 years");
	}
	
	public int getGradYear()
	{
		return gradYear;
	}
	
	public void setGradYear(int gradYear)
	{
		int year = Calendar.getInstance().get(Calendar.YEAR);
		if(gradYear <= (year) && gradYear >= (year-4))
			this.gradYear = gradYear;
		else
			System.out.println("Graduation year must be after" + (year-4));

	}
	
	public String getGradStream()
	{
		return gradStream;
	}
	
	public void setGradStream(String gradStream) 
	{
		String []stream = new String[] {"COMPUTER", "IT", "ELECTRICAL", "MECH", "CIVIL", "CHEMICAL", "AUTO"};
		int flag = 0;
		for (int i = 0; i < stream.length; i++) 
		{
			if(gradStream.equalsIgnoreCase(stream[i]))
			{
				this.gradStream = gradStream;
				flag =1;
				break;
			}
		}
		if(flag == 0)
			System.out.println("Stream must be one of COMPUTER, IT, " + 
				"ELECTRICAL,MECH ,CIVIL ,CHEMICAL, AUTO");
	}

	public String toString() {
		return "Student_IET [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", gradYear="
				+ gradYear + ", gradStream=" + gradStream + "]";
	}
	
}
