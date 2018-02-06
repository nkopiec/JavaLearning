//str263
package pl.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionII {

	public static void main(String[] args) {
		String regex = "[0-9]+";
		
		Pattern pattern = Pattern.compile(regex);
		String txt = "12347";
		Matcher matcher = pattern.matcher(txt);
		boolean match = matcher.matches();
		System.out.println("Tekst: " + txt + '\n' + (match ? " " : " NIE ") + "pasuje do wzorca: " + regex);
		
		txt = "123 996";
		matcher.reset(txt);
		match = matcher.matches();
		System.out.println("Tekst: " + txt + '\n' + (match ? " " : " NIE ") + "pasuje do wzorca: " + regex);
	}

}
