package Students;

public class student2 {
	String name;
	int age;
	char gender;

	student2() {

	}

	student2(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String toString() {
		String str = name + "," + age + "," + gender;
		return str;

	}

	public void checkMale(student2[] arr) {
		System.out.println("Display Male");
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getGender() == 'm') {
				count++;
				System.out.println("Male = " + arr[i]);
			}

		}
		System.out.println("Total Male = " + count+ "\n");
	}

	public void checkFemale(student2[] arr) {
		System.out.println("Display Female");
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i].getGender() == 'f') {

				count++;
				System.out.println("Female = " + arr[i]);
			}
		}
		System.out.println("Total Female = " + count+ "\n");
	}

	public void CheckElder(student2 arr[]) {
		System.out.println("Display Elder");
		int age = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].age > age) {
				age = arr[i].age;
			}

		}
		System.out.println("Elder = " + age+ "\n");
	}
	
	public void CheckYounger(student2[] arr) {
		System.out.println("Display Younger = ");
		int age = arr[0].age;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].age < age) {
				age = arr[i].age;
			}

		}
		System.out.println("Younger = " + age+ "\n");
	}
	
	public  float avgAge(student2[] arr) {
		System.out.println("Display Average Age = ");
		float sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum  + arr[i].getAge();

		}
            float avgAge = (sum/arr.length);
            System.out.println("avgAge = " + avgAge+ "\n");
            return avgAge;
	}
	
	public float avgMale(student2[] arr) {
		System.out.println("Diaplay Average MaleAge = ");
		float sum = 0;
		int count =0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].getGender() =='m' || arr[i].getGender() == 'm') {
				sum = sum + arr[i].getAge();
				count++;
			}

		}
            float  avgMale = (sum/count);
            System.out.println("avgAge = " + avgMale+ "\n");
            return avgMale;

	}
	
	public float avgFemale(student2[] arr) {
		System.out.println("Diaplay Average FemaleAge = ");
		float sum = 0;
		int count =0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].getGender() =='f' || arr[i].getGender() == 'f') {
				sum = sum + arr[i].getAge();
				count++;
			}

		}
            float  avgFemale = (sum/count);
            System.out.println("avgAge = " + avgFemale+ "\n");
            return avgFemale;

	}

}