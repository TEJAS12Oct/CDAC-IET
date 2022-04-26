package Q3;

public class Usermain {

	public static void main(String[] args) {
		
		Polynomial l1=new Polynomial();
	
		l1.insert(5,3);
		l1.insert(7, 5);
		l1.insert(4, 4);
		l1.insert(4, 3);
		l1.insert(-5, 2);
		l1.display();
		
		Polynomial l2=new Polynomial();
		l2.insert(1, 8);
		l2.insert(5, 4);
		l2.insert(8, 9);
		l2.insert(6, 3);
		l2.display();
		
		Polynomial l4=l1.addition(l2);
		l4.display();
		 
		Polynomial l3=l1.multiplication(l2);
		l3.display();
		
		
		Polynomial l5=l1.substraction(l2);
		l5.display();
		
		
		
		
		
	}

	

}
