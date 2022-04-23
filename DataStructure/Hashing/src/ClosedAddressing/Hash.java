package ClosedAddressing;

public class Hash {
	LinkList[] llArray;

	public Hash(int size) {
		llArray = new LinkList[size];

		for (int i = 0; i < llArray.length; i++) {
			llArray[i] = new LinkList();
		}
	}

	public int hashFunction(String inputStr) {
		int sum = 0;
		for (int i = 0; i < inputStr.length(); i++) {
			System.out.print("String Char = " + inputStr.charAt(i) + " , String Length = " + inputStr.length());
			sum = sum + inputStr.charAt(i);
			System.out.println(" , Sum = " + sum);
		}
		System.out.println("Total Array Length  = " + llArray.length);
		int index = sum % llArray.length;
		System.out.println("Index(Sum % Length)  = " + index);
		return index;
	}

	public void insert(String inputStr) {
		int index = hashFunction(inputStr);
		System.out.print(inputStr + " key from hashFunction = " + index);

		llArray[index].append(inputStr);

		System.out.println(" and it is placed at " + index);
		System.out.println();
	}

	public void remove(String inputStr) {
		int index = search(inputStr);
		int status = llArray[index].deleteValue(inputStr);
		if (status == 0)
			System.out.println(inputStr + ", not found");
		else
			System.out.println(" and it is removed from " + index);
		System.out.println();
	}

	private int search(String inputStr) {

		int index = hashFunction(inputStr);

		if (llArray[index].isPresent(inputStr))
			System.out.print(inputStr + " key from hashFunction = " + index);
		else
			System.out.println(inputStr + ", not found");
		return index;
	}

	public String toString() {
		String str = "";

		str = "{ ";
		for (int i = 0; i < llArray.length; i++) {
			str = str + llArray[i] + ", ";
		}
		str = str + " }";
		return str;
	}
}
