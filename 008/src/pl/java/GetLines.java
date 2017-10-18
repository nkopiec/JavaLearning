package pl.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GetLines {
	
	public static void main(String[] args) {
		String fname = "tekst.txt";
		Scanner scan = null;
		try {
			scan = new Scanner(new File(fname));
			} catch (FileNotFoundException exc) {
				System.out.println("Plik " + fname + " nie istnieje");
				return;
			}
		int lcount = 0;
		int strLength = 0;
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			lcount++;
			strLength += line.length();
		}
		System.out.println("Liczba wierszy pliku: " + lcount + "/inch ³¹czna d³ugoœæ: " + strLength );
	}

}
