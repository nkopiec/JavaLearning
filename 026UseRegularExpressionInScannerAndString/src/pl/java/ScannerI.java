package pl.java;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerI {

	public static String quote(String s) {
		return "'" + s + "'" + " ";
	}
	
	public static void main(String[] args) {
		String txt = "1/2 /3/ 4";
		String delim = "[ /]";
		Scanner scan = new Scanner(txt).useDelimiter(delim);
		System.out.println("Tekst : " + quote(txt) + " Separator: " + quote(delim));
		while (scan.hasNext())
			System.out.print( quote(scan.next()) + " ");
		delim = "[ /]+";
		scan = new Scanner(txt).useDelimiter(delim);
		System.out.println("/nTekst : " + quote(txt) + "Separator: " + quote(delim));
		
		while (scan.hasNext())
				System.out.print( quote(scan.next()) + " ");
		
		txt = " 1/2 /3/ 4";
		scan = new Scanner(txt).useDelimiter(delim);
		System.out.println("\nTekst : " + quote(txt) + "Separator: " + quote(delim));
		while (scan.hasNext())
			System.out.print(quote(scan.next()) + " ");
		System.out.println("\nA split zrobi³oby taki \n" + Arrays.toString(txt.split(delim)));
	}

}
