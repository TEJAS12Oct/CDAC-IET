package Q1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

class Vehicle_Main

{
	public static void main(String[] args) 
	{

		ArrayList<Vehicle> list = new ArrayList<Vehicle>();

		list.add(new MotorCycles("MH 31 6071",new Person("Atharva",22) ));
		list.add(new Cars("MH 31 4545",new Person("PRANAY",45)));
		list.add(new Trucks("MH 02 1234",new Person("JAYANT",66)));
		list.add(new Trucks("VH_24537",new Person("PRIYA",25)));
		list.add(new Trucks("VH_24537",new Person("KARTIK",30)));

		Iterator<Vehicle> i =list.iterator();

		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}