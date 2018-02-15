package pl.java;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Boxing {

	public static void main(String[] args) {
		showSymFreq(new File("Raport.txt"), "[\\s\\p{Punct}]+");
			HashMap<String,Integer> map = new HashMap<>();
			Scanner scan = new Scanner("Raport.txt").useDelimiter("[\\s\\p{Punct}]+");
			while (scan.hasNext()) {
				String word = scan.next();
				map.put(word, map.getOrDefault(word, 0) + 1);
			}
			scan.close();
			System.out.println(map);
		

			Integer[] a = { 10, 20, 30 };
			int[] b = { 100, 200, 300 };
			System.out.println(Arrays.asList(a));
			System.out.println(Arrays.asList(b));
			System.out.println(Arrays.asList(1, 2, 3));
	}

	private static void showSymFreq(File file, String string) {
	}

}
