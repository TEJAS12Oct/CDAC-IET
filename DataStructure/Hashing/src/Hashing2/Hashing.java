package Hashing2;

public class Hashing {
	String[] strArray;

	public Hashing(int size) {
		strArray = new String[size];
	}

	public int HashFunction(String inputStr) {
		int sum = 0;
		for (int i = 0; i < inputStr.length(); i++) {
			System.out.print("String Char = " + inputStr.charAt(i) + " , String Length = " + inputStr.length());

			sum = sum + inputStr.charAt(i);
			System.out.println(" , Sum = " + sum);
		}
		System.out.println("Total String Length  = " + strArray.length);
		int index = sum % strArray.length;
		System.out.println("Index(Sum % Length)  = " + index);

		return index;
	}

	public void insertL(String inputStr) {
//		System.out.println(" Linear Probing = ");
		int index = HashFunction(inputStr);
		System.out.print(inputStr + " key from HashFunction = " + index);
		if (strArray[index] == null) {
			strArray[index] = inputStr;
		} else {
//	********************** Collision **********************
			while (true) {
				if (index < strArray.length - 1)
					index++;
				else
					index = 0;

				if (strArray[index] == null) {
					strArray[index] = inputStr;
					break;
				}
			}
		}
		System.out.print("  and it is placed at " + index);
		System.out.println("\n");

	}

	public void insertMyWay(String inputStr) {
//		System.out.println("Insert My Own Way =  ");
		int index = HashFunction(inputStr);
		System.out.print(inputStr + " key from hashFunction = " + index);

		if (strArray[index] == null) {
			strArray[index] = inputStr;
		} else {
// ********************** Collision **********************
			int i = 1;
			while (true) {
				index = index + i++;
				if (index > strArray.length - 1)
					index = 0;

				if (strArray[index] == null) {
					strArray[index] = inputStr;
					break;
				}
				i++;
			}
		}
		System.out.println(" and it is placed at " + index);
		System.out.println("\n");
	}

	public void insertQ(String inputStr) {
//		System.out.println("Quadratic Probing = ");
		int index = HashFunction(inputStr);
		System.out.print(inputStr + " key from hashFunction = " + index);

		if (strArray[index] == null) {
			strArray[index] = inputStr;
		} else {
// ********************** Collision **********************
			int i = 1;
			while (true) {
				index += (i * i);
				if (index > strArray.length - 1) {
					index = 0;
					i = 0;
				}

				if (strArray[index] == null) {
					strArray[index] = inputStr;
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
		strArray[index] = null;
		System.out.println("  and it is removed from " + index);
		System.out.println("\n");
	}

	public void removeMyWay(String inputStr) {
//		System.out.println("Remove my Own Way = ");
		int index = searchMyWay(inputStr);
		strArray[index] = null;
		System.out.println(" and it is removed from " + index);
		System.out.println("\n");
	}

	public void removeQ(String inputStr) {
//		System.out.println("Remove Quadratic");
		int index = searchQ(inputStr);
		strArray[index] = null;
		System.out.println(" and it is removed from " + index);
		System.out.println("\n");
	}

	private int searchL(String inputStr) {
//		System.out.println("Searching linear = ");
		int index = HashFunction(inputStr);
		System.out.print(inputStr + " key from HashFunction = " + index);

		if (strArray[index] != null && strArray[index].equals(inputStr)) {
			return index;
		} else {
// ********************** Collision **********************
			while (true) {
				if (index > strArray.length - 1)
					index++;
				else
					index = 0;

				if (strArray[index] != null && strArray[index].equals(inputStr)) {
					return index;
				}
			}
		}

	}

	private int searchMyWay(String inputStr) {
//		System.out.println("Searching My Own Way = ");
		int index = HashFunction(inputStr);
		System.out.print(inputStr + " key from HashFunction = " + index);

		if (strArray[index] != null && strArray[index].equals(inputStr)) {
			return index;
		} else {
// ********************** Collision **********************			
			int i = 1;
			while (true) {
				index = index + i++;
				if (index > strArray.length - 1)
					index = 0;

				if (strArray[index] != null && strArray[index].equals(inputStr)) {
					return index;
				}
			}
		}

	}

	private int searchQ(String inputStr) {
//		System.out.println("Searching Quadratic = ");
		int index = HashFunction(inputStr);
		System.out.print(inputStr + " key from HashFunction = " + index);

		if (strArray[index] != null && strArray[index].equals(inputStr)) {
			return index;
		} else {
// ********************** Collision **********************
			int i = 1;
			while (true) {
				index += (i * i);
				if (index > strArray.length - 1) {
					index = 0;
					i = 0;
				}

				if (strArray[index] != null && strArray[index].equals(inputStr)) {
					return index;
				}
				i++;
			}
		}

	}

	public String toString() {
		String str = " ";
		str = " { ";
		for (int i = 0; i < strArray.length; i++) {
			str = str + strArray[i] + " , ";
		}
		str = str + " } ";

		return str;
	}
}
