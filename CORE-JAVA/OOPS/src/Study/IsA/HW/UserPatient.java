package Study.IsA.HW;

public class UserPatient {

	public static void main(String[] args) {

		Patient P = new Patient("O+", "Tejas", 123, 98);
		System.out.println(P);

		System.out.println("Patient Name : " + P.getName() + " , BP :" + P.bp);

	}

}
