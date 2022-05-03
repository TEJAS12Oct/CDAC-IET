package Study.Threads;

public class JoinExample {

	public static void main(String[] args) throws InterruptedException {
		Thread TH1 = new Thread(new Task(10));
		TH1.start();

		TH1.join(); // Main Thread Pause Till TH1 is Completed
		System.out.println("JOB DONE THANK YOU.........!!!!!!!!");
	
	}
}// End of Join Class

class Task implements Runnable {

	int range;

	Task(int r) {
		range = r;
	}

	@Override
	public void run() {
		for (int i = 0; i <= range; i++) {
			System.out.println(i + " " + Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
