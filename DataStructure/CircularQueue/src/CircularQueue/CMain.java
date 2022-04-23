package CircularQueue;
public class CMain {

	public static void main(String[] args) {

			CQueue q1=new CQueue();
			q1.insert(10);
			q1.insert(20);
			q1.insert(30);
			//q1.remove();
			//q1.remove();
			q1.insert(40);
			q1.insert(50);
			q1.insert(60);
			q1.remove();
			q1.remove();
			
		System.out.println(q1);
	}
	
	
	
}
