package Collection.HW2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class TableThread extends Thread
{
	@Override
	public void run()
	{
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

		for (int i = 2; i <= 20; i++) 
		{
			for (int j = 1; j <= 10; j++) 
			{
				pw.println(i+" x "+j+" = "+(i*j));
			}
			pw.println("------------------------------------------------");
			System.out.println("table of "+i+" is done");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		pw.flush();
		pw.close();
	}
}

