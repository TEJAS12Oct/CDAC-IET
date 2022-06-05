// matrix multiplication

package POG;

public class MatrixMain {

	public static void main(String[] args) {
		Matrix m1 = new Matrix(3, 3);
		Matrix m2 = new Matrix(3, 3);
		Matrix res = new Matrix(3, 3);
		m1.accept_matrix();
		m2.accept_matrix();

		System.out.println(m1);
		System.out.println(m2);

		res = m1.add(m2);
		System.out.println("Addition : \n" + res);

		res = m1.multiply(m2);
		System.out.println("Multiplication = \n" + res);

	}

}
