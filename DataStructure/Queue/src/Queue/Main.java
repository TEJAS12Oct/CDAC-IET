package Queue;

public class Main {

	public static void main(String[] args) {

		Queue q1 = new Queue();
		q1.insert(20);
		q1.insert(200);
		q1.insert(2000);
		q1.insert(50);
		q1.remove();
		q1.remove();
		System.out.println(q1);

		Queue q2 = new Queue(5);
		q2.insert(70000);
		q2.insert(900);
		q2.insert(40000);
		q2.insert(50000);
		q2.insert(60000);
		q2.remove();
		q2.remove();
		System.out.println(q2);

		Queue q3 = q2.concat(q1);
		System.out.println(q3);
		
		if (q1.equals(q2))
			System.out.println("q1 and q2 are same...");
		else
			System.out.println("q1 and q2 are different...");

	}
}
