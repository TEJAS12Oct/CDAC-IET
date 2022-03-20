package MenuDriven;
import java.util.Scanner;

public class Cafe1
{
	private static int costumerCount = 0;
	private static int totalBill;
	private static int totalDayIncome=0;
	private static final String passward = "Pratik";
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("Good Morning...\nEnter Your Passward : ");
		
		do 
		{
		String pass = sc.next();
		
		if(pass.equals(passward))
		{
			int flag;
			do
			{
			System.out.println("Press\n1 for new costumer \n0 for exit(Only for authorized Person)");
			flag = sc.nextInt();
			
			switch(flag)
			{
				case 1:
				{
					totalBill=0;
					totalDayIncome = totalDayIncome + HotelMenu();
					costumerCount++;
					break;
				}
				case 0:
				{
					System.out.println("Enter passward:");
					pass = sc.next();
					
					if(pass.equals(passward))
					{
						System.out.println("Total Day Income = "+ totalDayIncome
											+"\nCostumers Visited Today :" +costumerCount
											+"\nGood Night....");
						return;
					}
					
					else
					{
						System.out.println("Wrong Passward");
						continue;
					}
					
				}
				default :
				{
					System.out.println("Wrong Choice");
					continue;
				}
			}
			
			}while(true);
		}
			
		else
		{
			System.out.println("Wrong Passwaor, Try Again : ");
			continue;
		}
		
		}while(true);
	}

	private static int HotelMenu() 
	{
		int flag;
		do
		{
		System.out.println("Choose the category:"+
							"\n1 for Cold Drink"+
							"\n2 for Hot Drink"+
							"\n3 for Snacks"+
							"\n4 for Ice Cream"+
							"\n0 for Exit");
		flag = sc.nextInt();
		
		switch(flag)
		{
			case 0 :
			{
				System.out.println("Are you sure to exit: \n0 for yes \n1 for continue:");
				flag = sc.nextInt();
			
				if(flag == 0)
				{
					System.out.println("Your Total Bill is :"+totalBill+
						           "\nThanks for visiting");
					return totalBill;
				}
			
				else
				{
					continue;
				}
			}
		
			case 1 :
			{
				coldDrink();
				break;
			}
			case 2 :
			{
				hotDrink();
				break;
			}
			case 3 :
			{
				snacks();
				break;
			}
			case 4 :
			{
				iceCream();
				break;
			}
			default :
			{
				System.out.println("Wrong Choice");
				continue;
			}
			
		}
		
		}while(true);
		
		
	}

	private static void coldDrink()
	{
		int flag, quantity;
		do
		{
		System.out.println("Choose the item:"+
							"\n1 for Pepsi : 20/-"+
							"\n2 for Coke : 25/-"+
							"\n3 for Mocha : 50/-"+
							"\n4 for Cold Cofee : 40/-"+
							"\n5 for Cold Cofee with Crush : 50/-"+
							"\n0 for Exit");
		flag = sc.nextInt();
		
		switch(flag)
		{
			case 0 :
			{
				return;
			}
			case 1 :
			{
				System.out.println("Enter Quantity : ");
				quantity = sc.nextInt();
				totalBill = totalBill + (quantity * 20);
				break;
			}
			case 2 :
			{
				System.out.println("Enter Quantity : ");
				quantity = sc.nextInt();
				totalBill = totalBill + (quantity * 25);
				break;
			}
			case 3 :
			{
				System.out.println("Enter Quantity : ");
				quantity = sc.nextInt();
				totalBill = totalBill + (quantity * 50);
				break;
			}
			case 4 :
			{
				System.out.println("Enter Quantity : ");
				quantity = sc.nextInt();
				totalBill = totalBill + (quantity * 40);
				break;
			}
			case 5 :
			{
				System.out.println("Enter Quantity : ");
				quantity = sc.nextInt();
				totalBill = totalBill + (quantity * 50);
				break;
			}
			default :
			{
				System.out.println("Wrong Choice");
				continue;
			}
			
		}
		
		}while(true);
		
	}

	private static void hotDrink()
	{
		int flag, quantity;
		do
		{
		System.out.println("Choose the item:"+
							"\n1 for Tea : 10/-"+
							"\n2 for Cofee : 25/-"+
							"\n3 for Hot Chocolate : 50/-"+
							"\n0 for Exit");
		flag = sc.nextInt();
		
		switch(flag)
		{
			case 0 :
			{
				return;
			}
			case 1 :
			{
				System.out.println("Enter Quantity : ");
				quantity = sc.nextInt();
				totalBill = totalBill + (quantity * 10);
				break;
			}
			case 2 :
			{
				System.out.println("Enter Quantity : ");
				quantity = sc.nextInt();
				totalBill = totalBill + (quantity * 25);
				break;
			}
			case 3 :
			{
				System.out.println("Enter Quantity : ");
				quantity = sc.nextInt();
				totalBill = totalBill + (quantity * 50);
				break;
			}
			default :
			{
				System.out.println("Wrong Choice");
				continue;
			}
			
			
		}
		
		}while(true);
		
		
	}

	private static void snacks() 
	{
		int flag, quantity;
		do
		{
		System.out.println("Choose the item:"+
							"\n1 for Vadapav : 20/-"+
							"\n2 for Maggie : 40/-"+
							"\n3 for Dahi Misal : 80/-"+
							"\n4 for Dabeli : 25/-"+
							"\n5 for Panipuri : 30/-"+
							"\n6 for Dahipuri : 40/-"+
							"\n0 for Exit");
		flag = sc.nextInt();
		switch(flag)
		{
			case 0 :
			{
				return;
			}
			case 1 :
			{
				System.out.println("Enter Quantity : ");
				quantity = sc.nextInt();
				totalBill = totalBill + (quantity * 20);
				break;
			}
			case 2 :
			{
				System.out.println("Enter Quantity : ");
				quantity = sc.nextInt();
				totalBill = totalBill + (quantity * 40);
				break;
			}
			case 3 :
			{
				System.out.println("Enter Quantity : ");
				quantity = sc.nextInt();
				totalBill = totalBill + (quantity * 80);
				break;
			}
			case 4 :
			{
				System.out.println("Enter Quantity : ");
				quantity = sc.nextInt();
				totalBill = totalBill + (quantity * 25);
				break;
			}
			case 5 :
			{
				System.out.println("Enter Quantity : ");
				quantity = sc.nextInt();
				totalBill = totalBill + (quantity * 30);
				break;
			}
			case 6 :
			{
				System.out.println("Enter Quantity : ");
				quantity = sc.nextInt();
				totalBill = totalBill + (quantity * 40);
				break;
			}
			default :
			{
				System.out.println("Wrong Choice");
				continue;
			}
			
		}
		
		}while(true);
		
	}

	private static void iceCream()
	{
		int flag, quantity;
		do
		{
		System.out.println("Choose the item:"+
							"\n1 for Chocolate : 40/-"+
							"\n2 for Vanilla : 30/-"+
							"\n3 for Butterschotch : 35/-"+
							"\n4 for Dry Fruits : 50/-"+
							"\n0 for Exit");
		flag = sc.nextInt();
		
		switch(flag)
		{
			case 0 :
			{
				return;
			}
			case 1 :
			{
				System.out.println("Enter Quantity : ");
				quantity = sc.nextInt();
				totalBill = totalBill + (quantity * 40);
				break;
			}
			case 2 :
			{
				System.out.println("Enter Quantity : ");
				quantity = sc.nextInt();
				totalBill = totalBill + (quantity * 30);
				break;
			}
			case 3 :
			{
				System.out.println("Enter Quantity : ");
				quantity = sc.nextInt();
				totalBill = totalBill + (quantity * 35);
				break;
			}
			case 4 :
			{
				System.out.println("Enter Quantity : ");
				quantity = sc.nextInt();
				totalBill = totalBill + (quantity * 50);
				break;
			}
			default :
			{
				System.out.println("Wrong Choice");
				continue;
			}
			
			
		}
		
		}while(true);
		

		
	}

}
