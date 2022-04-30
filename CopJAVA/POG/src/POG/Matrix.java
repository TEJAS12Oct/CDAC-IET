package POG;

import java.util.Scanner;

public class Matrix {
	int mat[][];

	Matrix(int n, int m) {
		mat = new int[n][m];
	}

	void accept_matrix() {
		Scanner sc = new Scanner(System.in);
		int i, j;
		for (i = 0; i < mat.length; i++) {
			for (j = 0; j < mat[i].length; j++) {
				System.out.println("Enter a number :");
				mat[i][j] = sc.nextInt();
			}
		}
	}

	public String toString() {
		int i, j;
		String str = new String("");
		for (i = 0; i < mat.length; i++) {
			for (j = 0; j < mat[i].length; j++) {
				str = str + mat[i][j] + "  ";
			}
			str = str + "\n";
		}
		return str;
	}

	public  Matrix multiply(Matrix m) {
		Matrix r = new Matrix(mat.length, mat.length);
		int i, j, k;

		for (i = 0; i < 3; i++) // i=0
		{
			for (j = 0; j < 3; j++) // j=1
			{
				for (k = 0; k < 3; k++) // k=2
				{
					r.mat[i][j] = r.mat[i][j] + (this.mat[i][k] * m.mat[k][j]);

				}
			}
		}
		return r;

	}

	public Matrix add(Matrix m) {
		Matrix r = new Matrix(mat.length, mat.length);
		int i, j;
		for (i = 0; i < this.mat.length; i++) {
			for (j = 0; j < this.mat[i].length; j++) {
				r.mat[i][j] = this.mat[i][j] + m.mat[i][j];
			}
		}
		return r;
	}
}
