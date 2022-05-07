package Collection.HW2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class NameList {

	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fout = new FileOutputStream("F:\\IET\\CODING\\CORE-JAVA\\TEJAS.txt", true);
		PrintWriter pw = new PrintWriter(fout);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Names : ");
		while (true) {
			String str = sc.nextLine();
			if (str.equalsIgnoreCase("quit"))
				break;
			str = FirstLetter.Upper(str);
			pw.println(str);
		}
		pw.flush();
		pw.close();
	}

}

class FirstLetter {

	public static String Upper(String str) {
		return null;
	}

}