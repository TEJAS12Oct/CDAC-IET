package MenuDriven;
import java.util.Scanner;

public class MainStudent {

	public static int avg;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student [] arr = new Student[5];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter name: ");
			String name = sc.next();
			
			System.out.println("Enter age: ");
			int age = sc.nextInt();
			
			System.out.println("enter gender: ");
			char gender = sc.next().charAt(0);
			arr[i]= new Student(name,age,gender);
		}
		int choice;
		do {
		System.out.println("Enter choice: ");
		System.out.println("1.Youngest student: ");
		System.out.println("2.eldest student: ");
		System.out.println("3.average of all students: ");
		System.out.println("4.Total male students: ");
		System.out.println("5.Total female student: ");
		System.out.println("6.Exit ");
		System.out.println("enter choice");
		
		 choice = sc.nextInt();
		switch(choice)
		{
		case 1:
		  Youngest_Student(arr);
			
			break;
		case 2: 
			Eldest_Student(arr);
			break;
		case 3:
			Average_Students(arr);
			break;
		case 4:
			Male_Students(arr);
			break;
		case 5: 
			Female_Students(arr);
			break;
		}
		}while(choice!=6);
		System.out.println("Bye bye.....");
		
	}
		
     public static void Youngest_Student(Student [] arr)
     {
    	 Student young = arr[0];
    	 for(int i=0;i<arr.length;i++ )
    		 if(arr[i].getAge()<young.getAge())
    		 {
    			 young = arr[i];
    		 }
    	 System.out.println("Youngest Student: "+young);
     }
     public static void  Eldest_Student(Student [] arr)
     { Student old = arr[0];
	 for(int i=0;i<arr.length;i++ )
		 if(arr[i].getAge()>old.getAge())
		 {
			 old = arr[i];
		 }
    	 System.out.println("Eldest Student: "+old);
     }
     public static void Average_Students(Student [] arr)
     {
    	 int sum=0,cout=0;
    	 for(int i=0;i<arr.length;i++)
    	 {
    		 sum = sum + arr[i].getAge();
    		 cout=cout+1;
    	 }
    	 System.out.println("Average of all students: "+(sum/cout));
     }
     public static void Male_Students(Student [] arr)
     {
    	 int count=0;
     
    	 for(int i=0;i<arr.length;i++)
    	 {
    		 if(arr[i].getGender()=='m')
    		 {
    			 count++;
    		 }
    	 }
    	 System.out.println("Total male students are: "+count);
     }
     public static void Female_Students(Student [] arr)
     {
    	 int count=0;
         
    	 for(int i=0;i<arr.length;i++)
    	 {
    		 if(arr[i].getGender()=='f')
    		 {
    			 count++;
    		 }
    	 }
    	 System.out.println("Total female students are: "+count);
     }
}
