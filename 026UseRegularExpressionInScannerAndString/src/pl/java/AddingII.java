package pl.java;

import java.util.Scanner;

public class AddingII {

	public static void main(String[] args) {
		String txt = "I have 34 years old, my mum are 15 years older from my";
		String delim = "[^0-9]+";
		
		Scanner scan = new Scanner(txt).useDelimiter(delim);
		int mum = 0;
		while (scan.hasNextInt()) {
			mum += scan.nextInt();
		}
		
		System.out.println("If : " + txt + "\nMum have " + mum + " years old");
	}

}
