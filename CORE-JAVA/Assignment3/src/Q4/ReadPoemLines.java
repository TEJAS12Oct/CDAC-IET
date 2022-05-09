package Q4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ReadPoemLines {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fin = new FileInputStream("F:\\IET\\CODING\\CORE-JAVA\\POEM.txt");
		Scanner sc = new Scanner(fin);

		ArrayList<String> a1 = new ArrayList<>();

		while (sc.hasNextLine())
			a1.add(sc.nextLine());

		Iterator<String> itr = a1.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
