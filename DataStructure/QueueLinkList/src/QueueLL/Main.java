package QueueLL;

public class Main {

	public static void main(String[] args) {

		QueueLL Qll = new QueueLL();

		Qll.insert(20);
		Qll.insert(200);
		Qll.insert(2000);

		System.out.println(Qll);

		Qll.Remove();
		System.out.println(Qll);
	}

}
