package pl.java;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceFirst {

	public static void main(String[] args) {
		// metoda replaceFirst 
		
				Path in = Paths.get("Tekst.txt");
				Path out = Paths.get("Tekst2.txt");
				String regex4 = "\\s*//.";
				Pattern pattern;
	//			Pattern pattern4 = pattern.compile(regex4);
	//			Matcher matcher4 = pattern.matcher("");
				
				ArrayList<String> newLines = new ArrayList<String>();
				Charset cs = Charset.defaultCharset();
//				for (String line : Files.readAllLines(in, cs)) {
	//				matcher.reset(line);
	//				String nline = matcher.replaceFirst("");
	//				newLines.add(nline);
	//			}
	//			Files.write(out, newLines, cs);
				

	}

}
