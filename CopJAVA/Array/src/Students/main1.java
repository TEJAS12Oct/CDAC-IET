package Students;

public class main1 {

	public static void main(String[] args) {
		Student1[] arr = new Student1[4];
		arr[0] = new Student1("Tejas", 22, 'M');
		arr[1] = new Student1("Jawale", 23, 'M');
		arr[2] = new Student1("Chanchal", 25, 'F');
		arr[3] = new Student1("Ram", 27, 'M');

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		arr[1].setAge(45);
		int a = arr[3].getAge();
		System.out.println(arr[1]);

	}

	

}
