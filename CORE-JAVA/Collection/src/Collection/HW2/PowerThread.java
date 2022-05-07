package Collection.HW2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class PowerThread extends Thread
{
	@Override
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		FileOutputStream fout = null;
		try
		{
			fout = new FileOutputStream("F:\\IET\\CODING\\CORE-JAVA\\Tables.txt",true);
		} catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintWriter pw = new PrintWriter(fout);
		
		do
		{
			System.out.println("enter the number to print power table(enter 0 to quit)");
			int num = sc.nextInt();
			if(num == 0) break;
			for (int i = 1; i <= 10; i++)
			{
				double power = Math.pow((double)num,(double)i);
				pw.println(num+"^"+i+" = "+power);
			}
			pw.println("------------------------------------------------");
			System.out.println("power table of "+num+" is done");
			
		}while(true);
		pw.flush();
		pw.close();
	}
}
