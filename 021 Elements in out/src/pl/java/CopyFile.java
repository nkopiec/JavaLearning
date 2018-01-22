package pl.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {
	public static void CopyFile(String path1,String path2) {
		
		InputStream inStream = null;
	    OutputStream outStream = null;
		
	    try{
	    	File fi = new File("C:/Andrzej/file.txt");
	        File fiI = new File("C:/Andrzej/fileI.txt");
	    	
	        inStream = new FileInputStream("C:/Andrzej/fileI.txt");
	        outStream = new FileOutputStream("C:/Andrzej/file.txt");

	        byte[] buffer = new byte[1024];

	        int length = 0;
	    	

	            outStream.write(buffer, 0, length);
	        
	        

	        inStream.close();
	        outStream.close();
	    	
	       

	    }catch(IOException e){
	        e.printStackTrace();
	}
	}
	public static void main(String[] args) {
		 System.out.println("Plik zostal skopiowany!");
}
}