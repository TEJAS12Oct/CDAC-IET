package Q1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class User {
	public static void main(String[] args) {

		ArrayList<Vehicle> AL = new ArrayList<Vehicle>(); // Create ArrayList Vehicle

		Vehicle V1 = new Vehicle("Tejas", "Bike", "12345", 2);
		Vehicle V2 = new Vehicle("RAM", "CAR", "54321", 4);
		Vehicle V3 = new Vehicle("SHAM", "Truck", "34531", 6);
		Vehicle V4 = new Vehicle("MAYUR", "Bike", "43216", 4);
		Vehicle V5 = new Vehicle("TUSHAR", " CAR", "64321", 4);

		Collection<Vehicle> ints = Arrays.asList(V1, V2, V3, V4, V5);
		AL.addAll(ints); // ADD All Data

		for (Vehicle V : AL) {
			System.out.println(V); // Print All Information
		}

//		int choice = 0;
//		Scanner Sc = new Scanner(System.in);

//		do {
//			System.out.println("\n0.Exit");
//			System.out.println("1.Registration Amount :");
//			System.out.println("Enter Choice :");
//			choice = Sc.nextInt();
//			switch (choice) {
//			case 1: {
//				Vehicle.RegistrationAmount(AL);
//				break;
//			}
//			}
//		} while (choice != 0);

		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Owner Name : ");
		String Own_Name = Sc.next();

		System.out.println("Enter Vehicle Type : ");
		String Veh_Name = Sc.next();

		System.out.println("Enter Value For X : CAR =12.2 ,Truck = 10.2 , Bike = 8.2");
		double X = Sc.nextDouble();
		
		Vehicle v1 = new Bike(2);
		v1.RegistrationAmount(new Bike(2) , 8.2);

		Vehicle v2 = new Car(4);
		v2.RegistrationAmount(new Car(2) , 12.2);

		Vehicle v3 = new Truck(6);
		v3.RegistrationAmount(new Truck(2) , 10.2);

	} // End Of Main
} // End Of Class
