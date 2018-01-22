package pl.java;

import java.io.File;
import java.io.IOException;

public class CreateFileII {

	public static void main(String[] args) {
		File fiII = new File("C:/Andrzej/fileII.txt");
		boolean fileExists = fiII.exists();
		try{
			if(!fileExists) {
				fileExists = fiII.createNewFile();
			}
		}catch(IOException e){
			
		}

	}

}
