package pl.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SaveFile {
	public static void main(String[] args) throws IOException {
		 convert("C:\\Users\\Lenovo\\Documents\\bla.log", "C:\\Users\\Lenovo\\Documents\\nothing.log");
	}
	
	public static void convert(String inCp, String outCp) throws IOException {
		try (BufferedReader in = new BufferedReader(
					new InputStreamReader(new FileInputStream(inCp)));
			BufferedWriter out = new BufferedWriter(
					new OutputStreamWriter(new FileOutputStream(outCp)))) {
			String line;
			while ((line = in.readLine()) != null) {
				out.write(line);
				out.newLine();
			}
		}
	}
}
