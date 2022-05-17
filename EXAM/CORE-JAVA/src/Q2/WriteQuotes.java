/*
Q2. Write a program that accepts inspiring quotes from user and append them to a text file. (15 marks)
Write another program that reads the text file and create a ArrayList of all the quotes.
Iterate though ArrayList and print each quote on console.

PRN = 049
 */

package Q2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteQuotes {
	public static void main(String[] args) throws FileNotFoundException {

		boolean append = true;
		FileOutputStream fout = new FileOutputStream("F:\\IET\\EXAM\\CORE-JAVA\\QUOTES.txt", append); // Append Quotes In Next Line
		PrintWriter pW = new PrintWriter(fout); // class implements all of the print methods found in PrintStream

		System.out.println("Enter Quotes : ");
		Scanner SC = new Scanner(System.in);  // Enter Quotes

		while (SC.hasNextLine()) {
			String S = SC.nextLine();
			if (S.equalsIgnoreCase("QUIT"))  // Breaking Condition
				break;
			pW.println(S);  
		}

		pW.flush(); //clear the stream
		pW.close();  // Close The Stream

	} // End Of Main
} // End OF Class
