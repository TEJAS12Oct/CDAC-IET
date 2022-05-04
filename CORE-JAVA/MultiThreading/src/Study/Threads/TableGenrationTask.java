package Study.Threads;

public class TableGenrationTask implements Runnable {

	@Override
	public void run() {
		Thread currentThread = Thread.currentThread(); 
		for (int j = 2; j <= 10; j++) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(j + " * " + i + " = " + (j * i) + " " + currentThread.getName());
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
