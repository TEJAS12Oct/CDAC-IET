package Collection.HW2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class NameListModify {

	public static void main(String[] args) throws FileNotFoundException 
	{
		FileInputStream fin = new FileInputStream("F:\\IET\\CODING\\CORE-JAVA\\TEJAS.txt");
		Scanner fsc = new Scanner(fin);
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		while(fsc.hasNextLine())
		{
			list.add(fsc.nextLine());
		}
		do
		{
			System.out.println("press \n1. Show all names in the file\n" + 
					"2. Show how many names are there in the file\n" + 
					"3. Show names in sorted order with index\n" + 
					"4. Remove from file an entry if the user enters the index\n" + 
					"0. quit");
			int ch = sc.nextInt();
			switch (ch)
			{
			case 0:
				return;
				
			case 1:
				//Collections.sort(list);
				for (int i = 0; i < list.size(); i++) 
				{
					System.out.println(list.get(i));
				}
				break;
				
			case 2:
				System.out.println("There are "+list.size()+" names in the list");
				break;
				
			case 3:
				Collections.sort(list);
				for (int i = 0; i < list.size(); i++) 
				{
					System.out.println((i+1)+". "+ list.get(i));
				}
				break;
				
			case 4:
				System.out.println("Enter the number of name you want to remove");
				for (int i = 0; i < list.size(); i++) 
				{
					System.out.println((i+1)+". "+ list.get(i));
				}
				int flag = sc.nextInt();
				list.remove(flag-1);
				updatlist(list);
				break;

			default:
				System.out.println("Wrong Choice try again...");
				break;
			}
			
		}while(true);
	}// end of main

	private static void updatlist(ArrayList<String> list) throws FileNotFoundException
	{
		FileOutputStream fout = new FileOutputStream("F:\\IET\\CODING\\CORE-JAVA\\TEJAS.txt",false);
		PrintWriter pw = new PrintWriter(fout);
		Iterator<String> it = list.iterator();
		while(it.hasNext())
			pw.println(it.next());
		pw.flush();
		pw.close();
	}
}//end of NameListModify
