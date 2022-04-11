package CODE;
import  java.util.*;
public class fibbonaci {

	public static void main(String[] args) {
		int  a=0,b=1,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No = ");
		int num = sc.nextInt();
		System.out.println("num = " + num);
		
		for(int i=0; i<num; i++)
	     {
	         System.out.println(""  + a);
	         c = a + b; 
	         a = b;
	         b = c;
	     }
		
	}

}
