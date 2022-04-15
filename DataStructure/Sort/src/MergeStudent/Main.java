package MergeStudent;

public class Main {

	public static void main(String[] args) {
		Student[] crr = new Student[7];

		Student S1 = new Student("Tejas", 12);
		Student S2 = new Student("Tejas", 21);
		Student S3 = new Student("Tejas", 7);
		Student S4 = new Student("Tejas", 5);
		Student S5 = new Student("Tejas", 30);
		Student S6 = new Student("Tejas", 48);
		Student S7 = new Student("Tejas", 50);

		crr[0] = S1;
		crr[1] = S2;
		crr[2] = S3;
		crr[3] = S4;
		crr[4] = S5;
		crr[5] = S6;
		crr[6] = S7;

		System.out.println("Before Sort  ");
		MergeSort.print(crr);

		MergeSort.MergeS(crr, 0, crr.length - 1);
		System.out.print("Merge Sorting = ");
		MergeSort.print(crr);

	}

}
