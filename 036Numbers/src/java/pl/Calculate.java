package java.pl;

import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		Scanner Osama = new Scanner(System.in);
		int sum = 0;
		int mean = 0;
		int meater = 0;
		
		while (meater < 10) {
			System.out.println("Wpisz liczbê nr: " + meater);
			sum += Osama.nextInt();
			meater++;
		}
		meater = sum/10;
		System.out.println("Mean: " + mean);
	}
}
