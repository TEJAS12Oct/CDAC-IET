package Q1;
public class Vehicle
{

	private String Reg_No;
	private Person owner;
	private int noOfWheels;
	private double insurance;

	public Vehicle() 
	{

		this.Reg_No="MH 31 6071";
		this.owner=new Person();
		this.noOfWheels=4;
		this.insurance=5000;

	}

	public Vehicle(String vhNum, Person owner, int wheelNum, double insurance) 
	{

		this.Reg_No = vhNum;
		this.owner = owner;
		this.noOfWheels = wheelNum;
		this.insurance = insurance;
	}

	public double insuranceCalculator()
	{
		return 0;
	}

	public String getReg_No() 
	{
		return Reg_No;
	}

	public void setReg_No(String Reg_No)
	{
		this.Reg_No = Reg_No;
	}

	public Person getOwner() 
	{
		return owner;
	}

	public void setOwner(Person owner) 
	{
		this.owner = owner;
	}

	public int getNoOfWheels() 
	{
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels)
	{
		this.noOfWheels = noOfWheels;
	}

	public double getInsurance() 
	{
		return insurance;
	}

	public void setInsurance(double insurance)
	{
		this.insurance = insurance;
	}

	@Override
	public String toString() 
	{
		return "[regNumber=" + Reg_No + ", owner=" + owner + ", noOfWheels=" + noOfWheels + ", insurance="
				+ insurance + "]";
	}



}// End of Vehicle class.


class MotorCycles extends Vehicle
{

	Person p1=new Person();

	public MotorCycles()
	{

		this.setReg_No("MH 31 6071");
		this.setNoOfWheels(2);
		this.setOwner(p1);
		this.setInsurance(insuranceCalculator());

	}

	public MotorCycles(String Reg_No,Person p)
	{
		this.setReg_No(Reg_No);
		this.setOwner(p);
		this.setNoOfWheels(2);
		this.setInsurance(insuranceCalculator());
	}

	@Override
	public double insuranceCalculator()
	{

		double x=8.2;
		double amount=1000*this.getNoOfWheels()*x;
		return amount;
	}

	@Override
	public String toString() 
	{
		return "MOTORCYCLES [VEHICLE DETAILS ="+super.toString()+ "]";
	}



}// End of Motorcycle class.

class Cars extends Vehicle
{

	Person p1=new Person();

	public Cars()
	{

		this.setReg_No("MH 31 4545");
		this.setNoOfWheels(2);
		this.setOwner(p1);
		this.setInsurance(insuranceCalculator());

	}

	public Cars(String regNum,Person pl)
	{
		this.setReg_No(regNum);
		this.setOwner(p1);
		this.setNoOfWheels(4);
		this.setInsurance(insuranceCalculator());
	}

	@Override
	public double insuranceCalculator()
	{

		double x=12.2;
		double amount=1000*this.getNoOfWheels()*x;
		return amount;
	}

	@Override
	public String toString()
	{
		return "CARS [VEHICLE DETAILS ="+super.toString()+ "]";
	}



}// End of cars class

class Trucks extends Vehicle
{

	Person p1=new Person();

	public Trucks() {

		this.setReg_No("MH 02 1234");
		this.setNoOfWheels(2);
		this.setOwner(p1);
		this.setInsurance(insuranceCalculator());

	}

	public Trucks(String regNum,Person p)
	{
		this.setReg_No(regNum);
		this.setOwner(p);
		this.setNoOfWheels(6);
		this.setInsurance(insuranceCalculator());
	}

	@Override
	public double insuranceCalculator() 
	{

		double x=10.2;
		double amount=1000*this.getNoOfWheels()*x;
		return amount;
	}

	@Override
	public String toString() 
	{
		return "TRUCKS [VEHICLE DETAILS ="+super.toString()+ "]";
	}

}// End of tucks class.
