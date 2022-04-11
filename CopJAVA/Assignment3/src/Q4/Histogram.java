package Q4;
import java.util.Scanner;

public class Histogram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a String");
		String name=sc.next();
		name=name.toUpperCase();
		int a=0,e=0,i=0,o=0,u=0,ch;
		for(int j=0;j<name.length();j++)
		{
			if(name.charAt(j)=='A')
			{
				a++;	
			}
			

			if(name.charAt(j)=='E')
			{
				e++;	
			}
			

			if(name.charAt(j)=='I')
			{
				i++;	
			}

			if(name.charAt(j)=='O')
			{
				o++;	
			}

			if(name.charAt(j)=='U')
			{
				u++;	
			}
			
		}
	do {	System.out.println("0. Exit \n 1.A Histogram \n 2.E Histogram\n 3.I Histogram\n 4. O Histogram \n 5.U Histogram" );
		System.out.println("Enter your choice between 0 -5:  ");
		 ch=sc.nextInt();
		switch(ch)
		{
			case 1:print_histogram(a,'A');break;
			case 2:print_histogram(e,'E');break;
			case 3:print_histogram(i,'I');break;
			case 4:print_histogram(o,'O');break;
			case 5:print_histogram(u,'U');break;
			default:System.out.println("invalid choice");	
		}
	}while(ch!=0);
		sc.close();
	}
	public static void print_histogram(int n,char ch)
	{
		System.out.print(ch +":");
		for(int i=0;i<n;i++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
