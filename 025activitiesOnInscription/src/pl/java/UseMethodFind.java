package pl.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UseMethodFind {


	public static void main(String[] args) {
		String regex = "[0-9]+";
		String txt = "123456";
		
		System.out.println("Tekst: \n" + "'" + txt + "'" + "\nWzorzec: " + "'" + regex + "'");
		
		Pattern pattern = Pattern.compile(regex);
		Matcher metcher = pattern.matcher(txt);
		
		String result = "";
		
		
		while (matcher.find()) {
			result += "\nDopasowano pod³añcuch '" + matcher.group() + "'" + "\nod pozycji " + matcher.start() + "\ndo pozycji " + matcher.end();			
		}
		if (result.equals("")) result = "Nie znaleziono ¿adnego podnapisu " + "\npasuj¹cego do wzorca";
		System.out.println(result);
	}

}
