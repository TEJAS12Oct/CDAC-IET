package Collection.HW2;

import java.util.Scanner;

public class Admin {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Users admin = new Users();
		do
		{
			System.out.println("press\n1 to add User \n2 to see all users"
					+ "\n3 to Login \n4 to change password \n5 to remove user \n0 to exit");
			int ch = sc.nextInt();
			switch (ch) {
			case 0:
				return;
				
			case 1:
			{
				System.out.println("Enter Username : ");
				String uname = sc.next();
				do
				{
					System.out.println("Enter New Password : ");
					String pass1 = sc.next();
					System.out.println("Re-Enter new Password : ");
					String pass2 = sc.next();
					if(pass1.equals(pass2))
					{
						admin.addUser(uname, pass2);
						break;
					}
					System.out.println("Re-ENtered Password does not match, Try Again...");
				}while(true);
				break;
			}
				
			case 2:
				admin.showUsers();
				break;
				
			case 3:
			{
				System.out.println("Enter Username : ");
				String uname = sc.next();
				System.out.println("Enter New Password : ");
				String pass1 = sc.next();
				admin.login(uname, pass1);
				break;
			}
			case 4:
			{
				System.out.println("Enter Username : ");
				String uname = sc.next();
				try
				{
					admin.changePassword(uname);
				} 
				catch (UnAuthorizedExeption e) 
				{
					System.out.println("Entered Password is not correct : ");
				}
				break;
			}
				
			case 5:
			{
				System.out.println("Enter Username : ");
				String uname = sc.next();
				System.out.println("Enter New Password : ");
				String pass1 = sc.next();
				try 
				{
					admin.removeUser(uname, pass1);
				} 
				catch (UnAuthorizedExeption e)
				{
					System.out.println("Entered Password is not correct : ");
				}
				break;
			}

			default:
				System.out.println("Wrong choice... Try Again...");
				break;
			}
			
		}while(true);
	}

}
