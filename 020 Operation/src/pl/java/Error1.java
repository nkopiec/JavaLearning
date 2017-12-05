package pl.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Error1 {
		public static void main(String[] args) {
			Scanner imput = new Scanner(System.in);
			System.out.println("How old are you? ");
			
			try {
			int old = imput.nextInt();
			System.out.println("You are " + old + " years old");
			} catch (InputMismatchException e) {
				System.out.println("ERROR");
			}
		}
}