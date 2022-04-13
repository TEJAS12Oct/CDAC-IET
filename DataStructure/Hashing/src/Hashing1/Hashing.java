package Hashing1;

public class Hashing {
	String[] StrArr;

	public Hashing(int size) {
		StrArr = new String[size];
	}

	public int HashFunction(String inputStr) {
		int sum = 0;
		for (int i = 0; i < inputStr.length(); i++) {
			System.out.print("String Char = " + inputStr.charAt(i) + " , String Length = " + inputStr.length());

			sum = sum + inputStr.charAt(i);
			System.out.println(" , Sum = " + sum);
		}
		System.out.println("Total String Length  = " + StrArr.length);
		int index = sum % StrArr.length;
		System.out.println("Index(Sum % Length)  = " + index);

		return index;
	}

	public void insertL(String inputStr) {
//		System.out.println(" Linear Probing = ");
		int index = HashFunction(inputStr);
		System.out.print(inputStr + " key from HashFunction = " + index);
		if (StrArr[index] == null) {
			StrArr[index] = inputStr;
		} else {
//	********************** Collision **********************
			while (true) {
				if (index < StrArr.length - 1)
					index++;
				else
					index = 0;

				if (StrArr[index] == null) {
					StrArr[index] = inputStr;
					break;
				}
			}
		}
		System.out.print("  and it is placed at " + index);
		System.out.println("\n");

	}

	public void insertQ(String inputStr) {
//		System.out.println("Quadratic Probing = ");
		int index = HashFunction(inputStr);
		System.out.print(inputStr + " key from hashFunction = " + index);

		if (StrArr[index] == null) {
			StrArr[index] = inputStr;
		} else {
// ********************** Collision **********************
			int i = 1;
			while (true) {
				index += (i * i);
				if (index > StrArr.length - 1) {
					index = 0;
					i = 0;
				}

				if (StrArr[index] == null) {
					StrArr[index] = inputStr;
					break;
				}
				i++;
			}
		}
		System.out.println(" and it is placed at " + index);
		System.out.println("\n");
	}

	public void removeL(String inputStr) {
//		System.out.println("Remove Linear = ");
		int index = searchL(inputStr);
		if (index < 0) {
			System.out.println("  " + inputStr + " is not Found");
			System.out.println();
		} else {
			StrArr[index] = null;
			System.out.println("  and it is removed from " + index);
			System.out.println("\n");
		}
	}

	public void removeQ(String inputStr) {
//		System.out.println("Remove Quadratic");
		int index = searchQ(inputStr);
		if (index < 0) {
			System.out.println("  " + inputStr + " is not Found");
			System.out.println();
		} else {
			StrArr[index] = null;
			System.out.println(" and it is removed from " + index);
			System.out.println("\n");
		}
	}

	public int searchL(String inputStr) {
//		System.out.println("Searching linear = ");
		int index = HashFunction(inputStr);
		System.out.print(inputStr + " key from HashFunction = " + index);

		if (StrArr[index] != null && StrArr[index].equals(inputStr)) {
			return index;
		} else {
			return -1;
		}
// ********************** Collision **********************
//			// while (StrArr[index] != null && StrArr[index].equals(inputStr)) {
//				if (index > StrArr.length - 1) {
//					index++;
//				} else {
//					index = 0;
//
//					if (StrArr[index] != null && StrArr[index].equals(inputStr))
//						return index;
////					else if (inputStr != toString()) {
////						System.out.println(inputStr + " Not Found");
////					}
//				}
//			}

//		}

	}

	public int searchQ(String inputStr) {

//		System.out.println("Searching Quadratic = ");
		int index = HashFunction(inputStr);
		System.out.print(inputStr + " key from HashFunction = " + index);
		
		if (StrArr[index] != null && StrArr[index].equals(inputStr)) {
			return index;
		} else if (index > StrArr.length - 1) {
			int i = 1;
			index += (i * i);
			index = 0;
			i = 0;

			if (StrArr[index] != null && StrArr[index].equals(inputStr)) {
			//	return index;
			}
			i++;
		}else 
		return -1;
		return index;

	}
// ********************** Collision **********************
//			int i = 1;
//			while (true) {
//				index += (i * i);
//				if (index > StrArr.length - 1) {
//					index = 0;
//					i = 0;
//				}
//
//				if (StrArr[index] != null && StrArr[index].equals(inputStr)) {
//					return index;
//				}
//				i++;
//			}
//		}

	public String toString() {
		String str = " ";
		str = " { ";
		for (int i = 0; i < StrArr.length; i++) {
			str = str + StrArr[i] + " , ";
		}
		str = str + " } ";

		return str;
	}
}
