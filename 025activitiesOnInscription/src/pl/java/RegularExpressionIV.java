package pl.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionIV {


	private static Pattern pattern;

	public static void main(String[] args) {
	String regex = "([0-9]+)\\s+(\\p{L}+)\\s+([1-9][0-9]*)";
	String txt = "1111 Odkurzacz 20";
	System.out.println("Tekst: " + "'" + txt + "'" + "\nWzorzec: " + "'" + regex + "'");
	Pattern patern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(txt);
	
	boolean inMatching = matcher.matches();
	if (inMatching) {
		int n = matcher.groupCount();
		for (int i = 1; i <=n; i++) {
			String grupa = matcher.group(i);
			System.out.println("Grupa " + i + " = '" + grupa + "'");
		}
	}

	}

}
