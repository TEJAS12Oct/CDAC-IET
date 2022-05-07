package IO;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		FileInputStream FIN = new FileInputStream("F:\\IET\\CODING\\CORE-JAVA\\data.Tejas");
		ObjectInputStream Oin = new ObjectInputStream(FIN);
		while (true) {
			try {
				Object OBJ = Oin.readObject(); // Deserialize
				System.out.println(OBJ);
			} catch (EOFException EOF) {
				System.out.println("File Reading Completed");
				break;
			}
		}
	}
}
