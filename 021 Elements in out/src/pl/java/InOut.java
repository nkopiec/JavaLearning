package pl.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class InOut {
	
	
	
	public static void main(String[] args) {
	
		

	}
	public void zapisPlikuText (String nazwaPliku)  {
		File plikDoZapisu = new File(nazwaPliku);
		try {
		BufferedWriter zapis = new BufferedWriter(new FileWriter(plikDoZapisu));
		zapis.write("wiersz 1");
		zapis.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
