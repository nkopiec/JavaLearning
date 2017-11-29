package pl.java;

import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quote temperature in degrees centigrade: ");
		int centigrade = input.nextInt();
		
		double fahrenheit = 1.8 * centigrade + 32.0;
		System.out.println("This is " + fahrenheit + " degrees Fahrenheit");

	}

}
