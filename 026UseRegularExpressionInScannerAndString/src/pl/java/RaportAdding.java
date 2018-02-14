package pl.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RaportAdding {

		private String raport;
		
		double sum(String what) {
			Scanner sc = new Scanner(raport);
			String regex = "\\d\\." + what + ":";
			
			if (sc.findWithinHorizon(regex, 0) == null) throw new IllegalArgumentException("Brak wymaganej kategori");
		
			double sum = 0;
			do {
				while (sc.hasNextDouble()) {
					sum += sc.nextDouble();
					
				}
			}while (sc.findWithinHorizon(regex, 0) != null);
			
			return sum;
		}
		public RaportAdding(String fname) throws FileNotFoundException {
			Scanner fs = new Scanner(new File(fname));
			raport = fs.useDelimiter("\\Z").next();
			fs.close();
		}
		public static void main(String[] args) throws FileNotFoundException {
			RaportAdding rep = new RaportAdding("C:\\Andrzej\\Raport.txt");
			double wydatki = rep.sum("wydatki");
			double dochody = rep.sum("dochody");
				   
		System.out.println("Dochody: " + dochody + "n/Wydatki: " + wydatki  );
		}

}
