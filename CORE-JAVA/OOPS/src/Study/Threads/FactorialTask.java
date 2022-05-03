package Study.Threads;

public class FactorialTask implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i <= 10; i++) {
			long fact = 1;
			for (int j = 2; j <= i; j++) {
				fact = fact * j;
			}
			System.out.println("Factorial Of : " + i + " = " + fact);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
