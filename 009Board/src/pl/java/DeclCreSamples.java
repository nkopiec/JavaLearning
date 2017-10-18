package pl.java;

import java.util.Scanner;

public class DeclCreSamples {
	
	private static void show(int[] a) {
		for (int elt : a) {
			System.out.println(elt + " ");
		}
		System.out.println();
	}

	private static String[] generateStringTab(int n) {
		String[] stab = new String[n];
		for (int i = 0; i < stab.length; i++) {
			stab[i] = i + 1 + "." + (char)('a' +i);
		}
		return stab;
		
	}
	
	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4 };
		show(a1);

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj rozmiar tablicy:");
		int n = sc.nextInt();
		int[] a2 = new int[n];
		for (int i = 0; i < a2.length; i++) {
			a2[i] = (n+i)*(i+1);
		}
		show(a2);
		
		show (new int[] { 7, 9, 11});
		for (boolean b : new boolean[] { true, false, true } ) {
			System.out.print(!b + " ");
		}
		
	System.out.println();
	
	for (String s : generateStringTab(5)) System.out.print(s + " ");
	}
}
