package POG;
import java.util.Scanner;

public class Mtrixtest {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {

	 int r,c;
		Mtrix m1 = null;
		Mtrix m2 = null;
		Mtrix res;int ch;
	do {
		
		menu();
		System.out.println("Enter your choice : ");
		ch=sc.nextInt();
		switch(ch)
		{
		  case 1:
			  		System.out.println("Enter no of row and column: ");
			  		r=sc.nextInt();
			  		System.out.println("Enter no of  column: ");
			  		c=sc.nextInt();
			  		m1 =new Mtrix(3, 3);
					m1.accept();	
					System.out.println("****NEW MATRIX******* ");
					System.out.println("Enter no of row and column: ");
			  		r=sc.nextInt();
			  		System.out.println("Enter no of  column: ");
			  		c=sc.nextInt();
					m2= new Mtrix(3, 3);
					m2.accept();break;
		  case 2:
			  	res = new Mtrix(3, 3);
			  	res=m1.add(m2);
			  	System.out.println("ADDITION"+"\n"+res);
			  	break;
			  	
		  case 3:
				res = new Mtrix(3, 3);
				res=m1.multiplication(m2);
				System.out.println("MULTIPLICATION\n "+res);break;
		  
		  case 4:
			  		System.out.println(m1);
			  		System.out.println(" ***NEW MATRIX*****");
			  		System.out.println(m2);
			 default: System.out.println("**********INVALID CHOICE*****");break;
			}
		}while(ch!=5);
	
		sc.close();
	}
	public static void menu()
	{
		System.out.println("1.ACCEPT ");
		System.out.println("2.ADDITION");
		System.out.println("3.MULTIPLICATION");
		System.out.println("4.DISPLAY");
		System.out.println("5.EXIT");
	}
}
