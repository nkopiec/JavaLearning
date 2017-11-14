package pl.java;

import java.io.InputStream;
import java.util.Scanner;

public class Scaner {

	public static void main(String[] args) {
		Scanner imput = new Scanner(System.in);
		System.out.println("Give your name: ");
		String name = imput.nextLine();
	
		System.out.println("Give your surname: ");
		String surname = imput.nextLine();
		System.out.println("Hello " + name + " " + surname + ", " + "how are you ?");
		
	}
}
