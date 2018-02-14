package pl.java;

import java.util.Locale;
import java.util.Scanner;

public class ScannerIII {

	public static void main(String[] args) {
		String txt = "en 1.1 fr 2,2 pl 3,3";
		Scanner scan = new Scanner(txt);
		String langSymRx = "[a-z][a-z]";
		double sum = 0;
		String lang = scan.findInLine(langSymRx);
		while(lang != null) {
			scan.useLocale(new Locale(lang));
			sum += scan.nextDouble();
			lang = scan.findInLine(langSymRx);
			
		}
		System.out.println("Tekst:\n" + txt + "\n\nSuma liczb: " + sum);
	}

}
