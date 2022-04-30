package POG;
import java.util.Scanner;

public class Mtrix {

	private int[][] math;

	Mtrix(int n, int m) {
		math = new int[n][m];
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < math.length; i++) {
			for (int j = 0; j < math[i].length; j++) {
				System.out.print("Enter ele: arr["+i+"]["+j+"]: ");
				math[i][j] = sc.nextInt();

			}
			System.out.println();
		}
	}
	
	public  String toString()
	{
		String str=new String();
		for(int i=0;i<math.length;i++)
		{
			for(int j=0;j<math[i].length;j++)
			{
				str=str+math[i][j] + "   ";
			}
			str= str +"\n";
			
		}
		return str;
	}
	
	public   Mtrix add(Mtrix m2)
	{
		Mtrix r=new Mtrix(math.length,math.length);
		for(int i=0;i<this.math.length;i++)
		{
			for(int j=0;j<this.math[i].length;j++)
			{
				r.math[i][j]=this.math[i][j]+m2.math[i][j];
			}
		}
		return r;
	}
	public Mtrix multiplication(Mtrix m2)
	{
		Mtrix s=new Mtrix (math.length,math.length);
		for(int i=0;i<math.length;i++)
		{
			for(int j=0;j<math.length;j++)
			{
				for(int k=0;k<math[j].length;k++)
				{
					s.math[i][j]=s.math[i][j]+(this.math[j][k]*m2.math[k][j]);
				}
			}
		}
		return s;
	}
}
