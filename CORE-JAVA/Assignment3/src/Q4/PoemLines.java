package Q4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class PoemLines {

	public static void main(String[] args) throws FileNotFoundException {
		
		boolean append = true;
		FileOutputStream fout=new FileOutputStream("F:\\IET\\CODING\\CORE-JAVA\\POEM.txt",append);
		PrintWriter pW=new PrintWriter(fout);
		
		System.out.println("Enter Poem : ");
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNextLine()) {
			String s=sc.nextLine();
			if(s.equals("quit"))	break;
			pW.println(s);
		}
		
		pW.flush();
		pW.close();

	}

}
