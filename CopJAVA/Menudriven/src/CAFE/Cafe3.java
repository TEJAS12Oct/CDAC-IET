package CAFE;

import java.util.Scanner;

public class Cafe3 {

	static double amount = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a, ch;
		System.out.println("***************************WELCOME************************");
		do {
			int qty, total = 0;
			System.out.println("1.Cold Drink ");
			System.out.println("2.Hot Drink ");
			System.out.println("3.Snack ");
			System.out.println("4.Ice Creame ");
			System.out.println("5.Exit ");
			System.out.println("Enter your choice between 1 to 5");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				
					System.out.println("--***COLD DRINKS**---");
					do {
						System.out.println("1.Mirinda   \t 22 Rs");
						System.out.println("2.Coke      \t 25 Rs");
						System.out.println("3.Pepsi     \t 20 Rs");
						System.out.println("4.Cold Cofee\t 50 Rs");
						System.out.println("5.Exit");
						System.out.println("Enter your choice bwtween 1 -5");
						a = sc.nextInt();
						switch (a) {
						case 1:
							System.out.println(" How much  you wants........?");
							qty = sc.nextInt();
							total = qty * 22;
							amount = total + amount;
						//	System.out.println("amount: " + amount);
							break;

						case 2:
							System.out.println(" How much  you wants........?");
							qty = sc.nextInt();
							total = qty * 25;
							amount = total + amount;
						//	System.out.println("amount: " + amount);
							break;

						case 3:
							System.out.println(" How much  you wants........?");
							qty = sc.nextInt();
							total = qty * 20;
							amount = total + amount;
							//System.out.println("amount: " + amount);
							break;

						case 4:
							System.out.println(" How much  you wants........?");
							qty = sc.nextInt();
							total = qty * 50;
							amount = total + amount;
							//System.out.println("amount: " + amount);
							break;

				
							
							default:System.out.println("invalid choice");
						}
					} while (a!=5);
					
				break;
				
			case 2:
			
				System.out.println("--****HOT DRINKS**-----");
				do
				{
					System.out.println("1.Tea   		\t 15 Rs");
					System.out.println("2.Cofee  		\t 30 Rs");
					System.out.println("3.Hot Chocolate \t 40 Rs");
					System.out.println("4.Exit");
					System.out.println("Enter your choice bwtween 1 -4");
					a = sc.nextInt();
					switch(a)
					{
					case 1:
						System.out.println(" How much  you wants........?");
						qty = sc.nextInt();
						total = qty * 15;
						amount = total + amount;break;
						
					case 2:
						System.out.println(" How much  you wants........?");
						qty = sc.nextInt();
						total = qty * 30;
						amount = total + amount;break;
					
					case 3:System.out.println(" How much  you wants........?");
						qty = sc.nextInt();
						total = qty * 15;
						amount = total + amount;break;	
					
					default: System.out.println("Invalid choice");break;
					
					}
					
				}while(a!=4);
			break;
			case 3:
			
				System.out.println("-------**SNACKS***------");
				do
				{
					System.out.println("1.Vada Pav   		\t 15 Rs");
					System.out.println("2.Dabeli         	\t 30 Rs");
					System.out.println("3.Samosa            \t 40 Rs");
					System.out.println("4.kachori           \t 20 Rs");
					System.out.println("5.Pizza             \t 200 Rs");
					System.out.println("6.Exit");
					System.out.println("Enter your choice bwtween 1 -6");
					a = sc.nextInt();
					switch(a)
					{
					case 1:
						System.out.println(" How much  you wants........?");
						qty = sc.nextInt();
						total = qty * 15;
						amount = total + amount;break;
						
					case 2:
						System.out.println(" How much  you wants........?");
						qty = sc.nextInt();
						total = qty * 30;
						amount = total + amount;break;
					
					case 3:System.out.println(" How much  you wants........?");
						qty = sc.nextInt();
						total = qty * 40;
						amount = total + amount;break;	
						
					
					case 4:System.out.println(" How much  you wants........?");
					qty = sc.nextInt();
					total = qty * 20;
					amount = total + amount;break;	
					
					case 5:System.out.println(" How much  you wants........?");
					qty = sc.nextInt();
					total = qty * 200;
					amount = total + amount;break;	
					
				
					default: System.out.println("Invalid choice");break;
					}
				}while(a!=6);
				break;
				
			case 4:
			
				System.out.println("-------***ICE-CREAM***------");
				do
				{
					System.out.println("1.Butter Scotch   	\t 35 Rs");
					System.out.println("2.Black Current     \t 40 Rs");
					System.out.println("3.Mango             \t 30 Rs");
					System.out.println("4.Vanilla           \t 35 Rs");
					System.out.println("5.Dry Fruit          \t 50 Rs");
					System.out.println("6.Exit ");
					System.out.println("Enter your choice bwtween 1 -6");
					a = sc.nextInt();
					switch(a)
					{
						
					case 1:
						System.out.println(" How much  you wants........?");
						qty = sc.nextInt();
						total = qty * 35;
						amount = total + amount;break;
						
					case 2:
						System.out.println(" How much  you wants........?");
						qty = sc.nextInt();
						total = qty * 40;
						amount = total + amount;break;
					
					case 3:System.out.println(" How much  you wants........?");
						qty = sc.nextInt();
						total = qty * 30;
						amount = total + amount;break;	
						
					
					case 4:System.out.println(" How much  you wants........?");
					qty = sc.nextInt();
					total = qty * 35;
					amount = total + amount;break;
					
					case 5:System.out.println(" How much  you wants........?");
					qty = sc.nextInt();
					total = qty * 50;
					amount = total + amount;break;
					
					
					default: System.out.println("Invalid choice");break;
					
					}
					
				}while(a!=6);
			break;
			
			default:System.out.println("inavlid choice");break;
			}

		} while (ch != 5);
		System.out.println("*****--Please visit again---****");
		System.out.println("Total Amount :   \t"+amount);
		sc.close();

	}

}
