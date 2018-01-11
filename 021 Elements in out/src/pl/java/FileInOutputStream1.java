package pl.java;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;


public class FileInOutputStream1 {
	public static void main(String[] args) throws IOException {
		copy("C:\\Users\\Lenovo\\Documents\\pgadmin.log", "ddd");
		
		
	}
	public static void copy(String fin, String fout) throws IOException {
			try (FileInputStream in = new FileInputStream(fin);
					FileOutputStream out = new FileOutputStream(fout)) {
				int c;
				while ((c = in.read()) != -1) System.out.print((char) c);//out.write(c);
			}
	
//		
//		
//				FileInputStream in = null;
//				FileOutputStream out = null;
//				
//				FileReader fr = new FileReader("C:\\Users\\Lenovo\\Documents\\pgadmin.log");
//				BufferedReader br = new BufferedReader(fr);
//				
//	try (FileInputStream in1 = new FileInputStream("in");
//			FileOutputStream out1 = new FileOutputStream("out")) {
//			int c;
//			while ((c = in.read()) != -1) out.write(c);
//		}catch (IOException exc) {
//			System.out.println("I/O eror: " + exc);
//			System.exit(1);
//		} finally {
//			try { 
//				if (in != null) in.close();
//				if (out != null) out.close();
//		} catch (IOException exc) {
//			System.out.println(exc.toString());
//		}
	
	}


	//public static void showStringsFromShortFile(String fname) throws IOException {
	//		String s = "";
		//	try (FileInputStream in = new FileInputStream(fname)) {
			//	int c;
			//	while ((c = ))
				
			//}/
	}






























































































































































































