package Q4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ReadFIle {

	public static void main(String[] args) 
	{
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("F:\\IET\\CODING\\CORE-JAVA\\POEM.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc = new Scanner(fin);
		ArrayList<String> poem = new ArrayList<>();
		while(sc.hasNextLine())
		{
			poem.add(sc.nextLine());
		}
		Iterator<String> itr = poem.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	
	}

}
