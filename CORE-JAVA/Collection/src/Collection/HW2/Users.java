package Collection.HW2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Users 
{
	private TreeMap<String, String> userInfo;
	Scanner sc = new Scanner(System.in);
	
	public TreeMap<String, String> getUserInfo()
	{
		return userInfo;
	}

	public Users()
	{
		userInfo = new TreeMap<String,String>();
	}
	
	public void addUser(String uname, String pswd)
	{
		Set<String> user = userInfo.keySet();
		Iterator<String> it = user.iterator();
		while(it.hasNext())
		{
			String u = it.next();
			if(u.equals(uname))
			{
				System.out.println("User Already Exists, Try Again...");
				return;
			}
		}
		userInfo.put(uname, pswd);
		System.out.println("User Addes successfully...");
	}
	
	public void showUsers()
	{
		Set<String> user = userInfo.keySet();
		Iterator<String> it = user.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	public String getPassword(String uname)
	{
		Set<String> user = userInfo.keySet();
		Iterator<String> it = user.iterator();
		while(it.hasNext())
		{
			String u = it.next();
			if(u.equals(uname))
				return userInfo.get(u);
		}
		System.out.println("User Not Found...");
		return null;
	}
	public void changePassword(String uname) throws UnAuthorizedExeption
	{
		Set<String> user = userInfo.keySet();
		Iterator<String> it = user.iterator();
		while(it.hasNext())
		{
			String u = it.next();
			if(u.equals(uname))
			{
				System.out.println("Enter Current Password : ");
				String pass = sc.next();
				if(userInfo.get(u).equals(pass))
				{
					do
					{
						System.out.println("Enter New Password : ");
						String pass1 = sc.next();
						System.out.println("Re-Enter new Password : ");
						String pass2 = sc.next();
						if(pass1.equals(pass2))
						{
							userInfo.put(u, pass2);
							System.out.println("Password change successfully...");
							return;
						}
						System.out.println("Re-ENtered Password does not match, Try Again...");
					}while(true);
				}
				else
					throw new UnAuthorizedExeption();
			}
		}
		System.out.println("User Not Found...");
	}//end of changePassword
	public void removeUser(String uname, String pass) throws UnAuthorizedExeption
	{
		Set<String> user = userInfo.keySet();
		Iterator<String> it = user.iterator();
		while(it.hasNext())
		{
			String u = it.next();
			if(u.equals(uname))
			{
				if(userInfo.get(u).equals(pass))
				{
					userInfo.remove(u);
					System.out.println("User Removed");
					return;
				}
				else
					throw new UnAuthorizedExeption();
			}
		}
		System.out.println("User Not Found...");
	}

	public void login(String uname, String pass1) 
	{
		Set<String> user = userInfo.keySet();
		Iterator<String> it = user.iterator();
		while(it.hasNext())
		{
			String u = it.next();
			if(u.equals(uname))
			{
				if(userInfo.get(u).equals(pass1))
				{
					System.out.println("Welcome");
				}
				else
				{
					System.out.println("Not Allowed");
				}
				return;
			}
		}
		System.out.println("Not Allowed");
	}
	
}//end of users

