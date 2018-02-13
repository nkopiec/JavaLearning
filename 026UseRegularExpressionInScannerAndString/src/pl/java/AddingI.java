package pl.java;

import java.util.Scanner;

public class AddingI {

	public static void main(String[] args) {
		String txt = "In 1998 year, I was 12 years old. Now I have 30 years old";
		String delim = "[^0-9]+";
		
		Scanner scan = new Scanner(txt).useDelimiter(delim);
		int sum = 0;
		while(scan.hasNextInt()) {
			sum += scan.nextInt();
		}
		System.out.println("tekst : " + txt + "\n\nNumbers sum: " + sum);

	}

}
