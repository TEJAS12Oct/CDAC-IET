package Q3;

public class main {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(7,3);
		System.out.println(r.getl());
		System.out.println(r.getW());
		System.out.println(r);
		
		r.setl(5);
		r.setW(4);
		System.out.println(r.getl());
		System.out.println(r.getW());
		r.display();
		System.out.println(r);
		r.area();

	}

}
