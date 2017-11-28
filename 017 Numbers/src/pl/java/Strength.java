package pl.java;

import java.util.Scanner;

public class Strength {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Give figure: ");
		int figure = input.nextInt();
		double sum = figure * figure * figure;
		System.out.println(sum);
		
		
	}

}
