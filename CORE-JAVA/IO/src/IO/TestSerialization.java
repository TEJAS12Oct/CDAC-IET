package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestSerialization {

	public static void main(String[] args) throws IOException {
		sub obj = new sub();
		obj.x = 888;
		obj.y = 999;
		obj.Dep = new Dep();
		obj.Dep.Z = 777;

		FileOutputStream FOUT = new FileOutputStream("F:\\IET\\CODING\\CORE-JAVA\\test.TEJA", true);
		ObjectOutputStream Oout = new ObjectOutputStream(FOUT);

		Oout.writeObject(obj);
		Oout.flush();
		Oout.close();
		FOUT.close();

		FileInputStream FIN = new FileInputStream("F:\\IET\\CODING\\CORE-JAVA\\test.TEJA");
		ObjectInputStream Oin = new ObjectInputStream(FIN);

		while (true) {
			try {
				sub obj2 = (sub) Oin.readObject();
				System.out.println("X = " + obj.x + " , Y = " + obj.y + " , Z = " + obj.Dep.Z);
			} catch (Exception E) {
				System.out.println(E);
				break;
			}
		}

	}

}

class Test {
	int x;
}

class sub extends Test implements Serializable {
	// transient Dep Dep;
	Dep Dep;
	int y;
}

class Dep implements Serializable {
	int Z;

}