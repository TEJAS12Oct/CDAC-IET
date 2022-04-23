package ClosedAddressing;

public class Main {
	public static void main(String[] args) {

		Hash H = new Hash(7);

		System.out.println("Closed Addressing : ");
		System.out.println("Linear Probing =  ");
		H.insert("Tejas");
		H.insert("Sajet");
		H.insert("RAM");
		System.out.println("Insert  = " + H + "\n");

		System.out.println("Remove = ");
		H.remove("Ram");
		H.remove("RAM");
		System.out.println("Remove = " + H);
	}
}
