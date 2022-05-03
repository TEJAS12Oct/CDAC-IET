package Study.Threads.DataShare;

public class MainThread {

	public static void main(String[] args) {
		Account a = new Account(5000);
		DepositeThread TH1 = new DepositeThread(a);
		WithDrawThread TH2 = new WithDrawThread(a);
		TH1.start();
		TH2.start();
	}

}

class DepositeThread extends Thread {
	private Account acct;

	public DepositeThread(Account a) {
		this.acct = a;
	}

	public void run() {
		int counter = 5;
		while (counter-- > 0) {
			acct.Deposite(500);
			acct.ShowBalnce();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class WithDrawThread extends Thread {
	private Account acct;

	public WithDrawThread(Account a) {
		this.acct = a;
	}

	public void run() {
		int counter = 5;
		while (counter-- > 0) {
			acct.withDraw(100);
			acct.ShowBalnce();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}