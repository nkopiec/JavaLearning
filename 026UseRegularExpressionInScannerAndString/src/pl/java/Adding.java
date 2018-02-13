package pl.java;

import java.util.Scanner;

public class Adding {

	public static void main(String[] args) {
		String txt = "Wydano najpierw 20, a pózniej 35.\n" + "Wkolejnym dniu zakupiono coœ za 1000";
		String delim = "[^0-9]+";
		
		Scanner scan = new Scanner(txt).useDelimiter(delim);
		int sum = 0;
		while(scan.hasNextInt()) {
			sum += scan.nextInt();
			
		}
		System.out.println("Tekst:\n" + txt + "\n\nSuma liczb: " + sum);

	}

}
