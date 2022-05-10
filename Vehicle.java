package Q1;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Vehicle extends Person {

	abstract Double RegistrationAmount();

	public String Vehicle_Type;
	public String Regi_No;
	public int No_of_Wheels;

	public String getVehicle_Type() {
		return Vehicle_Type;
	}

	public void setVehicle_Type(String vehicle_Type) {
		Vehicle_Type = vehicle_Type;
	}

	public String getRegi_No() {
		return Regi_No;
	}

	public void setRegi_No(String regi_No) {
		Regi_No = regi_No;
	}

	public int getNo_of_Wheels() {
		return No_of_Wheels;
	}

	public void setNo_of_Wheels(int no_of_Wheels) {
		No_of_Wheels = no_of_Wheels;
	}

	public Vehicle() {

	}

	public Vehicle(String regi_No, String vehicle_Type, int no_of_Wheels) {
		Regi_No = regi_No;
		Vehicle_Type = vehicle_Type;
		No_of_Wheels = no_of_Wheels;
	}

	public Vehicle(String Name, String vehicle_Type, String regi_No, int no_of_Wheels) { // Parameterized Constructor
		super(Name);
		Regi_No = regi_No;
		Vehicle_Type = vehicle_Type;
		No_of_Wheels = no_of_Wheels;
	}

	@Override
	public String toString() {
		return "Owner Name : " + Name + " , Vehicle_Type : " + Vehicle_Type + ", Regi_No=" + Regi_No + ", No_of_Wheels="
				+ No_of_Wheels;
	}

	public void RegistrationAmount(ArrayList<Vehicle> AL, String own_Name, String veh_Name, double x) {
//		Scanner Sc = new Scanner(System.in);
//		System.out.println("Enter Owner Name : ");
//		String Own_Name = Sc.next();
//
//		System.out.println("Enter Vehicle Type : ");
//		String Veh_Name = Sc.next();
//
//		System.out.println("Enter Value For X : CAR =12.2 ,Truck = 10.2 , Bike = 8.2");
//		double X = Sc.nextDouble();

		double Reg_Amount = 0.0;
		for (int i = 0; i < AL.size(); i++) {
			if (veh_Name.equals(AL.get(i).Vehicle_Type) && own_Name.equals(AL.get(i).Name)) {
				Reg_Amount = 5000 *  * x;
			}
		}
		System.out.println("Registration Amount : " + Reg_Amount);
	}

	public void RegistrationAmount(Vehicle V, double d) {
		double Reg_Amount = 0.0;
//		if (veh_Name.equals(AL.get(i).Vehicle_Type) && own_Name.equals(AL.get(i).Name)) {
		Reg_Amount = 5000 * V.No_of_Wheels * d;
//		}

	}

}// End Of Class

class Bike extends Vehicle {
	public int No_of_Wheels;

	public int getNo_of_Wheels() {
		return No_of_Wheels;
	}

	public void setNo_of_Wheels(int no_of_Wheels) {
		No_of_Wheels = no_of_Wheels;
	}

	public Bike(int no_of_Wheels) {
		super();
		No_of_Wheels = no_of_Wheels;
	}

	@Override
	Double RegistrationAmount() {
		// TODO Auto-generated method stub
		return null;
	}

}

class Car extends Vehicle {

	public int No_of_Wheels;

	public int getNo_of_Wheels() {
		return No_of_Wheels;
	}

	public void setNo_of_Wheels(int no_of_Wheels) {
		No_of_Wheels = no_of_Wheels;
	}

	public Car(int no_of_Wheels) {
		super();
		No_of_Wheels = no_of_Wheels;
	}

	@Override
	Double RegistrationAmount() {
		// TODO Auto-generated method stub
		return null;
	}

}

class Truck extends Vehicle {
	
	public int No_of_Wheels;

	public int getNo_of_Wheels() {
		return No_of_Wheels;
	}

	public void setNo_of_Wheels(int no_of_Wheels) {
		No_of_Wheels = no_of_Wheels;
	}

	public Truck(int no_of_Wheels) {
		super();
		No_of_Wheels = no_of_Wheels;
	}

	@Override
	Double RegistrationAmount() {
		
		
		double X = 10.2;

		
			
				Reg_Amount = 5000 * No_of_Wheels * X;
			}
		}
		System.out.println("Registration Amount : " + Reg_Amount);
	}

}
