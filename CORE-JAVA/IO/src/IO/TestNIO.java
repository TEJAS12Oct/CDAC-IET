package IO;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class TestNIO {

	public static void main(String[] args) throws IOException {

		Path T = Paths.get("F:\\IET\\CODING\\CORE-JAVA\\TEJ.txt");
		
		Files.createFile(T);
		
		String S = "HABIBI , WELCOME TO TEJAS WORLDS...!!!!!";
		Files.write(T, S.getBytes(), StandardOpenOption.APPEND);
		List<String> Lines = Files.readAllLines(T);

		for (String s : Lines)
			System.out.println(s);
		
//		Files.delete(T);
	}

}




