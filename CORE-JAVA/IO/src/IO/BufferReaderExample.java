package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExample {

	public static void main(String[] args) throws IOException {

		FileReader FR = new FileReader("F:\\IET\\TEJAS.txt");
		BufferedReader Reader = new BufferedReader(FR);

		while (true) {
			String FileData = Reader.readLine();
			if (FileData == null)
				break;
			System.out.println(FileData);

		}

	}
}