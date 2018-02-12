package pl.java;

import java.util.Scanner;

public class StringI {

	public static void main(String[] args) {
		String txt = "LNAME: Kowalski FNAME: Jan BORN: 1980-12-01\n" + "LNAME: Malinowski FNAME: Stefan BORN: 1950-01-15\n";
		
		String delim = "(LNAME:) | (FNAME:) | (BORN:)";
		
		Scanner scan = new Scanner(txt).useDelimiter(delim);
		while(scan.hasNext()) {
			String s = scan.next();
			s = s.trim();
			System.out.println("'" + s + "'");
		}
		
	}

}
