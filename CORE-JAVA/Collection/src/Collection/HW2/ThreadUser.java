package Collection.HW2;

public class ThreadUser 
{

	public static void main(String[] args)
	{
		TableThread th1 = new TableThread();
		PowerThread th2 = new PowerThread();
		th1.start();
		th2.start();
	}

}
