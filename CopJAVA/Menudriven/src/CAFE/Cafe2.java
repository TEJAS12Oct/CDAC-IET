package CAFE;
import java.util.Scanner;

public class Cafe2 {
	
	static int totalBill=0;
	static String str="";
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[]args) {
		
		getMenu();

		printTotalBill();
		
	}
	
	public static int getMenu() {
		int choiceMenu;
		
		do {
		System.out.println("------------------------------\r\n"
				+ "1. Cold drink\r\n"
				+ "2. Hot drink\r\n"
				+ "3. Snack\r\n"
				+ "4. Ice cream\r\n"
				+ "5. Exit");
		 choiceMenu = sc.nextInt();
		 
		 loopingMenu(choiceMenu);
		}while(choiceMenu!=5);
		
		return choiceMenu;
	}
	
	public static void loopingMenu(int chMenu) {
		
		switch(chMenu) {
		case 1:
		{
			getColdDrinksMenu();
			break;
		}
		case 2:
		{
			getHotDrinksMenu();
			break;
		}
		case 3:
		{
			getSnacksMenu();
			break;
		}
		case 4:
		{
			getIceCreamMenu();
			break;
		}
		case 5:
		{
			break;
		}
		default:
		{
			System.out.println("Invalid Input.");
			break;
		}
		}
	}
	
	public static int getColdDrinksMenu() {
		int choiceCD;
		do {
		System.out.println("------------------------------\r\n"
				+ "1. Mirinda - 22/-\r\n"
				+ "2. Coke    - 25/-\r\n"
				+ "3. Pepsi   - 20/-\r\n"
				+ "4. Cold coffee - 50/-\r\n"
				+ "5. Exit\r\n");
		choiceCD =sc.nextInt();
		selectedColdDrink(choiceCD);
		}while(choiceCD!=5);
		
		return choiceCD;
	}
	
	public static void selectedColdDrink(int chCD) {
		int qty=0;
		switch(chCD) {
		case 1:
		{
			qty=getQty();
			totalBill=totalBill+22*qty;
			str=str+"\n" + "Mirinda - 22/-  Qty =" + qty;
			break;
		 }
		case 2:
		{
			qty=getQty();
			totalBill=totalBill+25*qty;
			str=str+"\n" + "Coke - 25/-  Qty =" + qty;
			break;
		}
		case 3:
		{
			 qty=getQty();
			 totalBill=totalBill+20*qty;
			 str=str+"\n" + "Pepsi - 20/-  Qty =" + qty;
			 break;
		}
		case 4:
		{
			 qty=getQty();
			 totalBill=totalBill+50*qty;
			 str=str+"\n" + "Cold Coffee - 50/-  Qty =" + qty;
			 break;
		}
		case 5:
		{
		 break;
		}
		default:
		{
			System.out.println("Invalid Input.");
			break;
		}
		}
	}
	
	public static int getHotDrinksMenu() {
		int choiceHD;
		do {
		System.out.println("------------------------------\r\n"
				+ "1. Tea    -   15/-\r\n"
				+ "2. Coffee -   30/-\r\n"
				+ "3. Hot choclate - 45/-\r\n"
				+ "4. Milk -20/-\r\n"
				+ "5. Exit");
		 choiceHD =sc.nextInt();
		 selectedHotDrink(choiceHD);
		}while(choiceHD!=5);
		
		return choiceHD;
	}
	
	public static void selectedHotDrink(int chHD) {
		int qty=0;
		switch(chHD) {
		case 1:
		{
			qty=getQty();
			totalBill=totalBill+15*qty;
			str=str+"\n" + "Tea - 15/-  Qty =" + qty;
			break;
		 }
		case 2:
		{
			qty=getQty();
			totalBill=totalBill+30*qty;
			str=str+"\n" + "Coffee - 30/-  Qty =" + qty;
			break;
		}
		case 3:
		{
			 qty=getQty();
			 totalBill=totalBill+45*qty;
			 str=str+"\n" + "Hot Chocalates - 45/-  Qty =" + qty;
			 break;
		}
		case 4:
		{
			 qty=getQty();
			 totalBill=totalBill+20*qty;
			 str=str+"\n" + "Milk - 20/-  Qty =" + qty;
			 break;
		}
		case 5:
		{
		 break;
		}
		default:
		{
			System.out.println("Invalid Input.");
			break;
		}
		}
	}
	
	public static int getSnacksMenu() {
		int choiceSnk;
		do {
		System.out.println("------------------------------\r\n"
				+ "1. Vada paav - 25/-\r\n"
				+ "2. Dabeli    - 20/-\r\n"
				+ "3. Samosa    - 18/-\r\n"
				+ "4. Idli      - 12/-\r\n"
				+ "5. Kachori   - 22/-\r\n"
				+ "6. Exit");
		choiceSnk =sc.nextInt();
		selectedSnack(choiceSnk);
		}while(choiceSnk!=6);
		
		return choiceSnk;
	}
	
	public static void selectedSnack(int chSnk) {
		int qty=0;
		switch(chSnk) {
		case 1:
		{
			qty=getQty();
			totalBill=totalBill+25*qty;
			str=str+"\n" + "Vadapav - 25/-  Qty =" + qty;
			break;
		 }
		case 2:
		{
			qty=getQty();
			totalBill=totalBill+20*qty;
			str=str+"\n" + "Dabeli - 20/-  Qty =" + qty;
			break;
		}
		case 3:
		{
			 qty=getQty();
			 totalBill=totalBill+18*qty;
			 str=str+"\n" + "Samosa - 18/-  Qty =" + qty;
			 break;
		}
		case 4:
		{
			 qty=getQty();
			 totalBill=totalBill+12*qty;
			 str=str+"\n" + "Idli - 12/-  Qty =" + qty;
			 break;
		}
		case 5:
		{
			 qty=getQty();
			 totalBill=totalBill+22*qty;
			 str=str+"\n" + "Kachori - 22/-  Qty =" + qty;
			 break;
		}
		case 6:
		{
			 break;
		}
		default:
		{
			System.out.println("Invalid Input.");
			break;
		}
		}
	}
	
	public static int getIceCreamMenu() {
		int choiceIC;
		do {
		System.out.println("------------------------------\r\n"
				+ "1. Butter scotch   -  35/-\r\n"
				+ "2. Black current   -  37/-\r\n"
				+ "3. Mango           -  25/-\r\n"
				+ "4. Vanilla         -  20/-\r\n"
				+ "5. Dry friut       -  50/-\r\n"
				+ "6. Exit\r\n");
		choiceIC=sc.nextInt();
		selectedIceCream(choiceIC);
		}while(choiceIC!=6);
		
		return choiceIC;
	}
	
	public static void selectedIceCream(int chIC) {
		int qty=0;
		switch(chIC) {
		case 1:
		{
			qty=getQty();
			totalBill=totalBill+35*qty;
			str=str+"\n" + "ButterScotch - 35/-  Qty =" + qty;
			break;
		 }
		case 2:
		{
			qty=getQty();
			totalBill=totalBill+37*qty;
			str=str+"\n" + "BlackCurrent - 37/-  Qty =" + qty;
			break;
		}
		case 3:
		{
			 qty=getQty();
			 totalBill=totalBill+25*qty;
			 str=str+"\n" + "Mango - 25/-  Qty =" + qty;
			 break;
		}
		case 4:
		{
			 qty=getQty();
			 totalBill=totalBill+20*qty;
			 str=str+"\n" + "Vanilla - 20/-  Qty =" + qty;
			 break;
		}
		case 5:
		{
			 qty=getQty();
			 totalBill=totalBill+50*qty;
			 str=str+"\n" + "DryFruit - 50/-  Qty =" + qty;
			 break;
		}
		case 6:
		{
			 break;
		}
		default:
		{
			System.out.println("Invalid Input.");
			break;
		}
		}
	}
	
	public static int getQty() {
		System.out.println("Enter the Quantity: ");
		int qty =sc.nextInt();
		return qty;
	}
	
	public static void printTotalBill() {
		System.out.println(str);
		System.out.println("Total Bill: "+totalBill);
	}
	
	
	
}


