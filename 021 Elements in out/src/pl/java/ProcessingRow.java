package pl.java;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ProcessingRow {

	public static void main(String[] args) throws IOException {
		int lcount = 0;
		int llenght = 0;
		int maxLen = 0;
		for(String line : Files.readAllLines(Paths.get("C:/Andrzej/fileI.txt"), Charset.defaultCharset())) {
			lcount++;
			int len = line.length();
			llenght += len;
			if (len > maxLen) maxLen = len;
			System.out.println(line);
		}
		System.out.println("--------------------------------");
		System.out.println("File Has got rows: " + lcount);
		System.out.println("accumulated value: " + llenght);
		System.out.println("the longest rows has got lengt: " + maxLen);
	}

}
