package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFormFile {

	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream FIN = new FileInputStream("F:\\IET\\CODING\\CORE-JAVA\\TEJAS.txt");

		Scanner SC = new Scanner(FIN);

		while (SC.hasNextLine()) {
			String FileData = SC.nextLine();
			System.out.println(FileData);
		}
	}

}
