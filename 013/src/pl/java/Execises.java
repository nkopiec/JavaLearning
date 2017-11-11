package pl.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Execises {
	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try (FileInputStream in1 = new FileInputStream("in1");
			FileOutputStream out1 = new FileOutputStream("out1") ) {
			int c;
		
			while ((c = in.read()) != -1) out.write(c);
			} catch (IOException exc) {
				System.err.println("I/O error: " + exc);
				System.exit(1);
			} finally {
				try {
					Object in1 = null;
					if (in1 != null) ((FileInputStream) in1).close();
					FileInputStream out1 = null;
					if (out1 != null) out1.close();
				} catch (IOException exc) {
					System.out.println(exc.toString());
				}
			}
	}
}
