
package Study.Threads;

public class MainThread1 {

	public static void main(String[] args) {
		TableGenrationTask Task1 = new TableGenrationTask();
		Thread Thread1 = new Thread(Task1);
		Thread1.start();
		
		
		FactorialTask FT = new FactorialTask();
		Thread Thread2 = new Thread(FT);
		Thread2.start();
	}

}
