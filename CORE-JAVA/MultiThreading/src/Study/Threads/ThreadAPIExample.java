package Study.Threads;

public class ThreadAPIExample {

	public static void main(String[] args) {
		ChatThread TH1 = new ChatThread();
//		TH1.setName("First");
		TH1.start();
		
		ChatThread TH2 = new ChatThread();
//		TH2.setName("Second");
		TH2.start();
		
		ChatThread TH3 = new ChatThread();
//		TH3.setName("Third");
		TH3.start();

		Thread TH4 = new Thread(new TableGenrationTask());
		TH4.setName("Fourth");
		TH4.start();
	}

}
