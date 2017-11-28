package pl.java;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Give figure: ");
		int figure = input.nextInt();
		int sum = figure % 2;
		
		if (sum == 0) {
			boolean sum1 = true;
			System.out.println("Your figure " + figure + " is even");
		}
			else if (sum != 0 ) {
				boolean sum1 = false;
				System.out.println("Your figure " + figure + " is odd");
			}
	}
}
