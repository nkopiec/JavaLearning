package pl.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutIn {
	
	public static void main(String[] args) throws IOException{
	//	FileInputStream in = null;
	//	FileOutputStream out = null;
	IOException e = new IOException("FileNotFoundException");
		
		try(FileInputStream in = new FileInputStream("in1");
			FileOutputStream out = new FileOutputStream("out1")) {
		int c;
		while ((c = in.read()) != -1) out.write(c);	
		}catch (IOException exc) {
			System.out.println("I/O error: " + exc);
			System.exit(1);
		}
		

	}

}
