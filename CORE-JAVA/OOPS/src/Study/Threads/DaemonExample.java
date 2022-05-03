package Study.Threads;

import java.util.Date;

public class DaemonExample {

	public static void main(String[] args) throws InterruptedException {
//		new Time().start();
		Time TH = new Time();
		TH.setDaemon(true); // We want the time thread to finish when non daemon threads are over
		TH.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread : " + i * i);
			Thread.sleep(100);
		}

	}

}

class Time extends Thread {
	@Override
	public void run() {

		while (true) {
			System.out.println(new Date());// toString of date is called
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}