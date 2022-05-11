package Q2;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.function.ObjDoubleConsumer;

public class StudentList {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		ArrayList<Student> list = new ArrayList<Student>();
		do
		{
			System.out.println("press\r\n1.Add Student to list.\r\n" + 
					"2.Add multiple Students to list.\r\n" + 
					"3.Remove Student from List\r\n" + 
					"4.Show all Students.\r\n" + 
					"5.Show all students on the basis of percentage.\r\n" + 
					"6.Find a student with student name.\r\n" + 
					"7.save all students details into file.\r\n" + 
					"9.print all students details into file.\r\n" +
					"8.Quit.");
			int ch = sc.nextInt();
			sc.nextLine();
			switch (ch) {
			case 8:
				return;

			case 1:
			{
				System.out.println("Enter te Name of the student : ");
				String name = sc.nextLine();
				System.out.println("Enter te Roll No of the student : ");
				int rollNo = sc.nextInt();
				System.out.println("Enter te Percentage of the student : ");
				double per = sc.nextDouble();
				sc.nextLine();
				System.out.println("Enter te address of the student : ");
				String addr = sc.nextLine();
				list.add(new Student(name, per, rollNo, addr));
				break;
			}

			case 2:
			{
				System.out.println("How many students you want to add : ");
				int num = sc.nextInt();
				sc.nextLine();
				for (int i = 0; i < num; i++)
				{
					System.out.println("Enter te Name of the student "+(i+1)+" : ");
					String name = sc.nextLine();
					System.out.println("Enter te Roll No of the student "+(i+1)+"  : ");
					int rollNo = sc.nextInt();
					System.out.println("Enter te Percentage of the student  "+(i+1)+" : ");
					double per = sc.nextDouble();
					sc.nextLine();
					System.out.println("Enter te address of the student "+(i+1)+"  : ");
					String addr = sc.nextLine();
					list.add(new Student(name, per, rollNo, addr));
				}
				break;
			}
				
			case 3:
			{
				removeStudent(list);
				break;
			}
				
			case 4:
			{
				System.out.println("All students are : ");
				Iterator<Student> it = list.iterator();
				while(it.hasNext())
				{
					System.out.println("=========================================");
					System.out.println(it.next());
					System.out.println("=========================================");
				}
				break;
			}

			case 5:
			{
				Collections.sort(list, new PercentageComparator());
				System.out.println("All students sorted with precentage : ");
				Iterator<Student> it = list.iterator();
				while(it.hasNext())
				{
					Student s = it.next();
					System.out.println("=========================================");
					System.out.println(s.getStudentName()+", "+s.getPercentage());
					System.out.println("=========================================");
				}
				break;
			}
			
			case 6:
			{
				System.out.println("Enter Name of the student : ");
				String name = sc.nextLine();
				Iterator<Student> it = list.iterator();
				int flag = 0;
				while(it.hasNext())
				{
					Student s = it.next();
					if(s.getStudentName().equalsIgnoreCase(name))
					{
						System.out.println(s);
						flag = 1;
						break;
					}
				}
				if(flag == 0)
					System.out.println("Student not found");
				break;
			}
				
			case 7:
				saveStudentInfo(list);
				break;
				
			case 9:
				printStudentInfoFromFile(list);
				break;

			default:
				System.out.println("Wrong CHoice try again");
				break;
			}
		}while(true);
	}

	private static void printStudentInfoFromFile(ArrayList<Student> list) 
	{
		FileInputStream fin = null;
		ObjectInputStream oin = null;
		try 
		{
			fin = new FileInputStream("E:\\Pratik CDAC\\Core Java\\files\\student.info");
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		try {
			oin = new ObjectInputStream(fin);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(true)
		{
			Object s = null;
			try {
				s = oin.readObject();
			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(s == null) break;
			
			System.out.println("===========================================");
			System.out.println(s);
			System.out.println("===========================================");
		}
		
	}

	private static void saveStudentInfo(ArrayList<Student> list) 
	{
		FileOutputStream fout = null;
		ObjectOutputStream obj = null;
		try 
		{
			fout = new FileOutputStream("E:\\Pratik CDAC\\Core Java\\files\\student.info");
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("File not found");
		}
		try 
		{
			obj = new ObjectOutputStream(fout);
		} 
		catch (IOException e) 
		{
			System.out.println("IO exception");
		}
		System.out.println("All students sorted with precentage : ");
		Iterator<Student> it = list.iterator();
		while(it.hasNext())
		{
			try {
				obj.writeObject(it.next());
			} catch (IOException e) 
			{
				System.out.println("IO exception");
			}
		}
		
	}

	private static void removeStudent(ArrayList<Student> list)
	{
		System.out.println("Enter Name of the student you want to remove : ");
		String name = sc.nextLine();
		Iterator<Student> it = list.iterator();
		int flag = 0;
		int count = 0;
		while(it.hasNext())
		{
			Student s = it.next();
			if(s.getStudentName().equalsIgnoreCase(name))
			{
				list.remove(count);
				flag = 1;
				break;
			}
			count++;
		}
		if(flag == 0)
			System.out.println("Student not found");
	}

}

class PercentageComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2)
	{
		if(o1.getPercentage() < o2.getPercentage()) return -1;
		if(o1.getPercentage() > o2.getPercentage()) return 1;
		else return 0;
	}
	
}
