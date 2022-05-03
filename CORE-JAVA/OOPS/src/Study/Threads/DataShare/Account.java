package Study.Threads.DataShare;

public class Account {
	private int balance;

	public Account(int bal) {
		this.balance = bal;
	}

//	THREAD  SAFE method  = synchronized method
	public synchronized void Deposite(int amt) {
		synchronized (this) {
			balance += amt;
		}
	}

//	THREAD SAFE method
	public synchronized void withDraw(int amt) {
		synchronized (this) {
			balance -= amt;
		}
	}

	public void ShowBalnce() {
		System.out.println("Current Balance : " + balance);
	}
}
