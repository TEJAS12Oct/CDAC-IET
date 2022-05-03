package Study.Threads;

public class ExampleWaitNotify {

	public static void main(String[] args) {
		Data d = new Data();
		Incr th1 = new Incr(d);
		th1.start();
		Decr th2 = new Decr(d);
		th2.start();

	}

}//end of class

class Incr extends Thread
{
	Data d;
	Incr(Data d){ this.d = d;}
	public void run()
	{
		while(true)
		{
			synchronized(d) {
			if(d.value == 10)
				try {
					System.out.println("waiting for d to decrement");
					d.wait(); //waiting
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			d.value++;
			d.notifyAll();
			}
			System.out.println("after incr "+d.value);
		}
	}
}

class Decr extends Thread
{
	Data d;
	Decr(Data d){ this.d = d;}
	public void run()
	{		
		while(true)
		{
			synchronized(d) {
			if(d.value == 0) 
			{
				try {
					System.out.println("waiting for incrementing");
					d.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			d.value--;
			d.notifyAll();
			}//synchronized block ends
			System.out.println("after decr "+d.value);
		}
	}
}


class Data
{
	int value;
}