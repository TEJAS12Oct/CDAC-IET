package Q3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int l;
		int w;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length = ");
		l = sc.nextInt();
		System.out.println("Enter the Width = ");
		w = sc.nextInt();
		//System.out.println(l);

		Rectangle r = new Rectangle(l,w);
		System.out.println(r.getl());
		System.out.println(r.getW());
		System.out.println(r);
		r.area();

		r.setl(5);
		r.setW(4);
		System.out.println(r.getl());
		System.out.println(r.getW());
		r.display();
		System.out.println(r);
		r.area();

	}

}
