package pl.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Element {
	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("in1");
			out = new FileOutputStream("out1");
			int c;
			while ((c = in.read()) != -1) out.write(c);
			} catch (IOException exc) {
				System.err.println("I/O error: " + exc);
				System.exit(1);
			} finally {
				try {
					if (in != null) in.close();
					if (out != null) out.close();
				} catch (IOException exc) {
					System.out.println(exc.toString());
				}
			}
	}

}
