//str263
package pl.java;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionII {

	public static void main(String[] args) throws IOException {
		
		// metoda matches()
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
		
		// metoda Find()
		
		
		String regex1 = "[0-9]+";
		String txt1 = "123456";
		
		System.out.println("Tekst: \n" + "'" + txt1 + "'" + "\nWzorzec: " + "'" + regex1 + "'");
		
		Pattern pattern1 = Pattern.compile(regex1);
		Matcher metcher = pattern.matcher(txt1);
		
		String result = "";
		
		
		while (matcher.find()) {
			result += "\nDopasowano pod³añcuch '" + matcher.group() + "'" + "\nod pozycji " + matcher.start() + "\ndo pozycji " + matcher.end();			
		}
		if (result.equals("")) result = "Nie znaleziono ¿adnego podnapisu " + "\npasuj¹cego do wzorca";
		System.out.println(result);
		
		//c-264
		
		String regex2 = "([0-9]+)\\s+(\\p{L}+)\\s+([1-9][0-9]*)";
		String txt2 = "1111 Odkurzacz 20";
		System.out.println("Tekst: " + "'" + txt2 + "'" + "\nWzorzec: " + "'" + regex2 + "'");
		Pattern patern = Pattern.compile(regex);
		Matcher matcher2 = pattern.matcher(txt);
		
		boolean inMatching = matcher2.matches();
		if (inMatching) {
			int n = matcher2.groupCount();
			for (int i = 1; i <=n; i++) {
				String grupa = matcher2.group(i);
				System.out.println("Grupa " + i + " = '" + grupa + "'");
			}
		}
		
		// metoda split()
		
		String regex3 = "[\\s\\p{Punct}]+";
		String txt3 = "Ala(11), kot,; pies-1 <kot2>[mrówka]";
		
		Pattern pattern3 = Pattern.compile(regex3);
		String[] words = pattern.split(txt3);
		
		System.out.println("Liczba wyró¿ionych s³ow: " + words.length);
		for (String w : words) {
			System.out.println(w);
			
		}
		
		
		String regex5 = "\\((\\d):(\\d)\\)";
		Pattern pattern5 = Pattern.compile(regex5);
		
		String txt5 = "tekst 1 (ale) (2) (1:2) wo³anie f() (3:4) (8:9) (10:11)";
		Matcher matcher5 = pattern.matcher(txt5);
		String newTxt5 = matcher.replaceAll("$2:$1");
		System.out.println("Tekst przed zamian¹: ");
		System.out.println(txt5);
		System.out.println("Tekst po zamianie: ");
		System.out.println(newTxt5);
	}

}
