/*
Q2. Write a program that accepts inspiring quotes from user and append them to a text file. (15 marks)
Write another program that reads the text file and create a ArrayList of all the quotes.
Iterate though ArrayList and print each quote on console.

PRN = 049
 */
package Q2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ReadQuotes {
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream FIN = new FileInputStream("F:\\IET\\EXAM\\CORE-JAVA\\QUOTES.txt");
		Scanner sc = new Scanner(FIN);

		ArrayList<String> AL = new ArrayList<>();  //ArrayList Create

		while (sc.hasNextLine())
			AL.add(sc.nextLine());  // Add All nextLine Quotes

		Iterator<String> itr = AL.iterator();  // Iterator a ArrayList

		while (itr.hasNext()) {
			System.out.println(itr.next());  // Print a Quotes One By One
		}
		
	} // End Of Main
} // End OF Class
