package pl.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("Companys"));
		HashSet<String> set = new HashSet<>();
		while (scan.hasNextLine()) {
			String firm = scan.nextLine();
			set.add(firm);
		}
		for (String elt : set) {
			System.out.println(elt);	
			
		}
		scan.close();	
		
		Scanner scanner = new Scanner(new File("Companys"));
		TreeSet<String> set2= new TreeSet<>();
		while (scanner.hasNextLine());
			set.add(scanner.nextLine());
			for (String elt : set) {
				System.out.println(elt);

			}
		
			scanner.close();
		
		Scanner scanner2 = new Scanner(new File("Companys"));
		ArrayList<String> list = new ArrayList<>();
		while (scan.hasNextLine());
		list.add(scan.nextLine());
		Collections.sort(list);
		int i = 0;
			for (String firm : list) {
				System.out.println(++i + ": " + firm);
		}
		scanner2.close();
	}
	
}
