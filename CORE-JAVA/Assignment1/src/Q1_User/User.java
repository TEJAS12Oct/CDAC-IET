package Q1_User;

import java.util.Calendar;
import java.util.Scanner;

import Q1.Student;

public class User
{
	public static void main(String[] args)
	{
		Student stud1 = new Student();
		Scanner sc = new Scanner(System.in);


		System.out.println("Enter first name of student : ");
		String fname = sc.next();
		stud1.setFirstName(fname);

		System.out.println("Enter last name of student : ");
		String lname = sc.next();
		stud1.setLastName(lname);

		while(true)
		{
			System.out.println("Enter age of the student(Must be in between 18 to 80");
			int age = sc.nextInt();
			if(age>=18 && age <= 80)
			{
				stud1.setAge(age);
				break;
			}	
			else
			{
				System.out.println("Age must be in between 18 to 80 years");
			}
		}
		while(true)
		{
			int year = Calendar.getInstance().get(Calendar.YEAR);
			System.out.println("Enter graduation year of the student(must be passed out after "+(year-4));
			int gradYear = sc.nextInt();
			if(gradYear <= (year) && gradYear >= (year-4))
			{
				stud1.setGradYear(gradYear);
				break;
			}
			else
			{
				System.out.println("Graduation year must be after" + (year-4));
			}
		}
		int flag = 0;
		while(flag != 1)
		{
			System.out.println("Enter the stream from (COMPUTER, IT,\r\n" + 
					"ELECTRICAL,MECH ,CIVIL ,CHEMICAL,AUTO)");
			String gradStream = sc.next();
			String []stream = new String[] {"COMPUTER", "IT", "ELECTRICAL", "MECH", "CIVIL", "CHEMICAL", "AUTO"};
			for (int i = 0; i < stream.length; i++) 
			{
				if(gradStream.equalsIgnoreCase(stream[i]))
				{
					stud1.setGradStream(gradStream);
					flag = 1;
					break;
				}
			}
			if(flag != 1)
				System.out.println("Stream must be one of COMPUTER, IT, " + 
							"ELECTRICAL,MECH ,CIVIL ,CHEMICAL,AUTO");

		}
		System.out.println("Name : "+stud1.getFirstName() +" "+stud1.getLastName()+
				"\nAge : "+stud1.getAge() + "\nGraduation Year : "+stud1.getGradYear()+
				"\nGraduation Stream : "+ stud1.getGradStream());
	}

}
