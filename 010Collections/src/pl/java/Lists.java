package pl.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Lists {
	
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String> list = new ArrayList<>();
			for (Scanner s = new Scanner(new File("Companys")); s.hasNextLine();) list.add(s.nextLine());
			TreeSet<String> ordSet = new TreeSet<>(list);
				System.out.println(list);
				System.out.println(ordSet);
	
		int i = 0;
			for (String firm : list) list.set(i++, firm + "- Polska");
				System.out.println(list);
			
	/*
			for (ListIterator<String> it = list.listIterator(); it.hasNext();) it.set(it.next()+ "- Polska");
				System.out.println(list); 
				
				System.out.println("Before: " + list);
					list.remove("PGS");
				System.out.println("After: " + list); 
				
				System.out.println("Before: " + list);
					list.remove(3);
					System.out.println("After: " + list);
			
				
				System.out.println("Before: " + list);
			for (Iterator<String> it = list.iterator(); it.hasNext();) {
				if (it.next().equals("PGS")) it.remove();
			}
				System.out.println("After: " + list); 
				
				
				ArrayList<String> array = new ArrayList<>();
				String list1;
				System.out.println("Na poczatku list1 = " + list1);
				String list2;
				System.out.println("Na poczatku list2 = " + list2);
				System.out.println("Usuwamy z list2 wszystkie te, które sa tez na list1");
				list2.removeAll(list1);
				System.out.println("Teraz list2 = " + list2);
				System.out.println("Dodamy cala list2 do list1");
				list1.addAll(list2);
				System.out.println("I w koncu list1 = " + list1);
				*/
				
	}

}
