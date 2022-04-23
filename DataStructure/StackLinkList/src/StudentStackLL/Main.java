package StudentStackLL;

public class Main {

	public static void main(String[] args) {
        
		Student S1 = new Student("Tej",12,333);
		Student S2 = new Student("RAj",13,444);
		Student S3 = new Student("yash",14,555);
		Student S4 = new Student("Dada",15,666);
		
		StackLL Sll = new StackLL();

		Sll.push(S1);
		Sll.push(S2);
		Sll.push(S3);
		Sll.push(S4);

		System.out.println(Sll);

		Sll.pop();
		Sll.pop();
		System.out.println(Sll);
	}

}
