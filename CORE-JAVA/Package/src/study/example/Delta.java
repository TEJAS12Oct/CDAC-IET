package study.example;

public class Delta {
	String Name;
	int value;

	public Delta() {

	}

	private Delta(String Name) {
		this.Name = Name;
	}

	Delta(int Value) {
		this.value = Value;
	}

	public static void Test1() {

	}

	public static void main(String[] args) {

		Delta D1 = new Delta();         // public Constructor is Accessible  
		Delta D2 = new Delta("Tejas");  // private Constructor is Accessible
		Delta D3 = new Delta(12);       // Default Constructor is Accessible

		Test1();
	}

}
