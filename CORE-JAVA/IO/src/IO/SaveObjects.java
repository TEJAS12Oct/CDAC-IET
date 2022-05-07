package IO;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SaveObjects {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream FOUT = new FileOutputStream("F:\\IET\\CODING\\CORE-JAVA\\data.Tejas");
		ObjectOutputStream Oout = new ObjectOutputStream(FOUT);

//		Object obj = new Object();

		Data obj = new Data();
		obj.Value = 100;
		obj.Desc = " century";
		Oout.writeObject(obj);
	
		obj = new Data();
		obj.Value = 200;
		obj.Desc = " double century";
		Oout.writeObject(obj);

		FileInputStream FIN = new FileInputStream("F:\\IET\\CODING\\data.Tejas");
		ObjectInputStream Oin = new ObjectInputStream(FIN);
		while (true) {
			try {
				Object OBJ = Oin.readObject();
				System.out.println(OBJ);
			} catch (EOFException EOF) {
				System.out.println("File Reading Completed");
				break;
			}
		}
	}
}

class Data implements Serializable {
	int Value;
	String Desc;

	@Override
	public String toString() {
		return Value + Desc;
	}

}
