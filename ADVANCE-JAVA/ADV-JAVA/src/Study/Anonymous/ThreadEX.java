package Study.Anonymous;

public class ThreadEX {

	public static void main(String[] args) {
		Runnable task = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("HELLO TEJAS");
				}

			}
		};
//      First Thread
		new Thread(task).start();
		
		
//      Second Thread
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					System.out.println("Hii ");
				}
			}
		}).start();

	}// End Of Main

}
