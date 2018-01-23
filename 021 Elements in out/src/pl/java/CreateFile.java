package pl.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

public class CreateFile {

	public static void main(String[] args) {
		File fi = new File("C:/natalia/file.txt");
		boolean fileExists = fi.exists();
		try {
			if(!fileExists) {
				fileExists = fi.createNewFile();
				
			}
		}catch (IOException e) {
			
		
	    }
		
	}
}
