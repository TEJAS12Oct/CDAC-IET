package Student;

import java.util.Arrays;

public class Hash {
	Student[] StudentArr;

	public Hash(int size) {
		StudentArr = new Student[size];
	}

	public int HashFunction(Student Instr) {
		long MobileNo = Instr.getMobileNo();
		int sum = 0, count;

		for (int i = 0; i < MobileNo; i++) {
			count = (int) (MobileNo % 100);
			MobileNo = MobileNo / 100;
			sum = sum + count;
			System.out.println("Sum = " + sum);
		}

		System.out.println("Total String Length  = " + StudentArr.length);
		int index = sum % StudentArr.length;
		System.out.println("Index(Sum % Length)  = " + index);

		return index;
	}

	public void insertL(Student Instr) {
//		System.out.println(" Linear Probing = ");
		int index = HashFunction(Instr);
		System.out.print(Instr + " key from HashFunction = " + index);
		if (StudentArr[index] == null) {
			StudentArr[index] = Instr;
		} else {
//	********************** Collision **********************
			while (true) {
				if (index < StudentArr.length - 1)
					index++;
				else
					index = 0;

				if (StudentArr[index] == null) {
					StudentArr[index] = Instr;
					break;
				}
			}
		}
		System.out.print("  and it is placed at " + index);
		System.out.println("\n");

	}

	public void removeL(Student Instr) {
//		System.out.println("Remove Linear = ");
		int index = searchL(Instr);
		StudentArr[index] = null;
		System.out.println("  and it is removed from " + index);
		System.out.println("\n");
	}

	public int searchL(Student Instr) {
//		System.out.println("Searching linear = ");
		int index = HashFunction(Instr);
		System.out.print(Instr + " key from HashFunction = " + index);

		if (StudentArr[index] != null && StudentArr[index].equals(Instr)) {
			return index;
		} else {
// ********************** Collision **********************
			while (true) {
				if (index > StudentArr.length - 1) {
					index++;
				} else {
					index = 0;

					if (StudentArr[index] != null && StudentArr[index].equals(Instr)) {
						return index;
					}
				}
			}
		}

	}

	public String toString() {
		String str = " ";
		str = Arrays.toString(StudentArr);
		return str;
	}
}
