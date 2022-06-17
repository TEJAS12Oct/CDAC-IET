package Study.Lambda;

public class LambdaEx {

	public static void main(String[] args) {

// Lambda Expression => Implement Interface , Override Method + Create Project
		Runnable R1 = () -> {

			while (true) {
				System.out.println("HI..!!!");
				try {
					Thread.sleep(1300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		};

		Thread T1 = new Thread(R1);
		T1.start();

	}

}
