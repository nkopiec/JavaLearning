package pl.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Introduction {
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String> array = new ArrayList<>();
		Scanner scanner = new Scanner(new File("Companys"));
		while (scanner.hasNextLine()) {
			String company = scanner.nextLine();
			array.add(company);
		}
		scanner.close();
		
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		
		Iterator<String> iterator = array.iterator();
		while (iterator.hasNext()) {
			String company = iterator.next();
			System.out.println(company);
		}
		
		for (Iterator<String> iter = array.iterator(); iter.hasNext();) {			
			String company = iter.next();
			System.out.println(company);
		}
	}
}
