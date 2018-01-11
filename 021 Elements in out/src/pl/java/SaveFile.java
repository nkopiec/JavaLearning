package pl.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SaveFile {
	public static void main(String[] args) {
		 SaveFile("C:\\Users\\Lenovo\\Documents\\bla.log", "C:\\Users\\Lenovo\\Documents\\nothing.log");
		}
	private static void SaveFile(String file, String file2) {
		// TODO Auto-generated method stub
		
	}
	public static void convert(String fin, String inCp,
			String fout, String outCp) throws IOException {
		try (BufferedReader in = new BufferedReader(
				new InputStreamReader(new FileInputStream(fin), inCp));
				BufferedWriter out = new BufferedWriter(
						new OutputStreamWriter(new FileOutputStream(fout), inCp))) {
			String line;
			while ((line = in.readLine()) != null) {
				out.write(line);
				out.newLine();
			}
		}
	}
}
