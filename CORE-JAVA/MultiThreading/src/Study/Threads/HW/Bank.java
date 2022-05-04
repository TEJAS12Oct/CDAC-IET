package Study.Threads.HW;

public class Bank {

	public static void main(String[] args) {
		
	Account a=new Account(5000);
	Deposit thread=new Deposit(a);
	Withdraw thread1=new Withdraw(a);
	thread.start();
	thread1.start();
	
	}
	
}
class Deposit extends Thread
{
	private Account amount;
	Deposit(Account a)
	{
		this.amount=a;
	}
	public void run()
	{
		int count=5;
		while(count-- > 0)
		{
			synchronized (amount) {
				if(amount.balance==6000)
					try {
						amount.wait();// if balance is 4000 then this thread wait or
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				amount.deposit(500);
				System.out.println("Balance Count  :"+count);

				amount.showbalance();
				amount.notifyAll();
				
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
class Withdraw extends Thread
{
	private Account amount;
	Withdraw(Account a)
	{
		this.amount=a;
	}
	public void run()
	{
		int count=5;
		while(count-- > 0)
		{
			synchronized (amount) {
				if(amount.balance==4000)
					try {
						amount.wait();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				amount.withdraw(100);
				System.out.println("Withdraw Count :"+count);
				amount.showbalance();
				amount.notifyAll();

			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
	}
}