package pl.java;

import java.awt.ScrollPaneAdjustable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
		private static char[] e;
		public static void main(String args[]) {
			createTable();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Wpisz cyfrê: ");
			try {
				int n = scanner.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("Nie wprowadzono cyfry ");
				System.err.println("Nie wprowadzono cyfry ");
				//System.out.println(e.getMessage());
				System.out.println(e);
			}
			System.out.println (division(5));
		}
		public static double division(int a) {
			Scanner scanner = new Scanner(System.in);
			try {
				return a/scanner.nextInt();
			}
			catch (ArithmeticException e) {
				return 0;
			}
			catch (InputMismatchException e) {
				return 233443;
			}
			finally { // wykonuje siê zawsze
				System.out.println("Finally");
			
			}
		
		}
			
		public static void createTable() {
			int tab[] = new int [10];
			try {
				tab[10] = 10;
			}
			catch (Exception e) {
			}
			System.err.println(e);
		}
	
		

}
