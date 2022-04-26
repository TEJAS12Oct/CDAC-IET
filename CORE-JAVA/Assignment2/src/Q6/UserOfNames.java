package Q6;
import java.util.Scanner;

public class UserOfNames {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		StudentNames st = new StudentNames(size);
		
		while(true)
		{
			System.out.println("Press \n1. Show all names" + 
					"\n2. Add name"+"\n3. Get name on index"+
					"\n4. quit");
			int ch = sc.nextInt();
			sc.nextLine();
			switch (ch)
			{
			case 4:
				return;
				
			case 1:
				st.showAllNames();
				break;
				
			case 2:
				System.out.println("Enter Name to Add : ");
				String name = sc.nextLine();
				st.addName(name);
				break;
				
			case 3:
				System.out.println("Enter the index : ");
				int index = sc.nextInt();
				System.out.println("Name at index : "+ st.getNameOnIndex(index));
				break;
				
			default:
				System.out.println("Wrogn choice... Try Again");
				break;
			}
		}
	}

}
