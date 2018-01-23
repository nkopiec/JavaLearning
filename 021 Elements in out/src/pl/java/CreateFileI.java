package pl.java;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateFileI {
	public static void main(String[] args) throws FileNotFoundException {
		File fiI = new File("C:/Andrzej/fileI.txt");
		boolean fileExists = fiI.exists();
		try{
			if(!fileExists) {
				fileExists = fiI.createNewFile();	
				
				
				}
			
		}catch(IOException e){
			
		
		
		}
		try(PrintWriter out = new PrintWriter("C:/Andrzej/fileI.txt")){
		    out.println("genius\n lalllala \n kskskksksks\n kdkkdkd");
		    out.close();
	}
	}

}
