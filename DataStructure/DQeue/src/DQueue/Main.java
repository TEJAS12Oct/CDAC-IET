package DQueue;

public class Main {

	public static void main(String[] args) {

		DQeue DQ = new DQeue();

		DQ.insertR(10);
		DQ.insertR(20);
		DQ.insertF(30);
		DQ.insertR(40);
		DQ.removeR();
		DQ.removeF();
		DQ.insertNewR(70);

		System.out.println(DQ);
	}

}
