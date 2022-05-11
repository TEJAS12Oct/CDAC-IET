package Q4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class WritePoemInFile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("F:\\IET\\CODING\\CORE-JAVA\\POEM.txt", true);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		PrintWriter pw = new PrintWriter(fout);
		System.out.println("Enter the poem(enter quit to exit) : ");
		while (true) {
			String str = sc.nextLine();
			if (str.equalsIgnoreCase("quit"))
				break;
			pw.println(str);
		}
		pw.flush();
		pw.close();
	}

}
