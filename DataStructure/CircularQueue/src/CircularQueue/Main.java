package CircularQueue;


public class Main {

	public static void main(String[] args) {
		CircularQ CQ = new CircularQ();
		CQ.insert(10);
		CQ.insert(20);
		CQ.insert(30);
		//CQ.remove();
		//CQ.remove();
		CQ.insert(40);
		CQ.insert(50);
		CQ.insert(60);
		CQ.remove();
		CQ.remove();
		System.out.println(CQ);
	}

}
