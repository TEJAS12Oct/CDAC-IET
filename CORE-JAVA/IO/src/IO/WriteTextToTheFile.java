package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteTextToTheFile {

	public static void main(String[] args) throws FileNotFoundException {
//      The file open in OverWrite Mode
//		FileOutputStream FOUT = new FileOutputStream("F:\\IET\\TEJAS.txt");

		boolean append = true;
		FileOutputStream FOUT = new FileOutputStream("F:\\IET\\TEJAS.txt", append);

		PrintWriter PW = new PrintWriter(FOUT);

		Scanner SC = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the String to Copy in File");

			String Input = SC.nextLine();
			if (Input.equalsIgnoreCase("Quit"))
				break;
			PW.println(Input);
			PW.flush(); // Buffer to HardDisk Copy
		}
		PW.close();
	}

}
