package Study.Threads.HW;

public class Account {

	
	int balance;
	
	Account(int amount)
	{
		this.balance=amount;
	}
	public void showbalance()
	{
		System.out.println("Balance :"+this.balance);
	}
	public  void deposit(int amount)
	{
		this.balance+=amount;
	}
	public void withdraw(int amount)
	{
		this.balance-=amount;
	}
	
}
