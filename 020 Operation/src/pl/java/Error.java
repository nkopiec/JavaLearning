package pl.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Error {
		public static void main(String[] args) {
			Scanner imput = new Scanner(System.in);
			System.out.println("Give your number: ");
			
			try {
			int number = imput.nextInt();
			System.out.println("Your number: " + number);
			} catch (InputMismatchException e) {
				System.out.println("ERROR");
			}
		}
}
