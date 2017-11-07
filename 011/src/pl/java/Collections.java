package pl.java;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.LinkedList;

public class Collections {
	public static void main(String args[]) {
		System.out.println("tekst");
		//System.out.println(inputStreamTest());
		//System.out.println(bufferedReaderTest());
		//System.out.println(streamTokenizertest());
		//saveText("ala ma kota");
		java.util.List <String> aList = new ArrayList(32);
		java.util.List <String> iList = new LinkedList();
		aList.add("Kotek");
		iList.add("Piesek");
		System.out.println(aList);
		System.out.println(iList);
	}
	public static String inputStreamTest() {
		System.out.println("Wprowadz dowolny znak  z klawiatury: ");
	try {
		char c = (char) System.in.read();
		String str = c + "" ;
		return str;
	}
	catch (Exception e) {
		return "error";
	}
	}
	public static String bufferedReaderTest() {
		BufferedReader brIn = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Wprowadz llinie tekstu i nacisnie enter");
		try {
			return brIn.readLine();
		}
			catch (Exception e) {
			return "-1";	
			}
	    }
	
	public static String streamTokenizertest() {
		StreamTokenizer streamTokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		System.out.println("Wprowadz liczbe");
		try {
			streamTokenizer.nextToken();
			if(streamTokenizer.ttype ==StreamTokenizer.TT_NUMBER)
				return streamTokenizer.toString();
			else
				return "-1";
		}
		catch (Exception e) {
			return "-1";
		}
		
	}
	public static void saveText(String text) {
		try {
			File file = new File("c:/Andrzej/text.txt");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(text);
			fileWriter.close();
		}
	catch (Exception e) {
		System.err.println(e);
	}
	}
}
