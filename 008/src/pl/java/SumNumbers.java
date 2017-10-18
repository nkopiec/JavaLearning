package pl.java;

import java.io.File;
import java.util.Scanner;

public class SumNumbers {
	public static void main(String[] args) {
		File f = new File("nums.txt");
		long sum = 0;
		String msg;
		try {
			for (Scanner sc = new Scanner(f); sc.hasNextInt(); sum += sc.nextInt());
			msg = "Suma: " + sum;
			} catch (Exception exc) {
				msg = exc.toString();
			}
		System.out.println(msg);
	}
	
	
	

}
