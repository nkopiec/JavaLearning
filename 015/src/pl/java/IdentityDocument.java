package pl.java;

import java.util.Scanner;

public class IdentityDocument {
	public static void main(String[] args) {
		System.out.println("Hi, it's making your identity document");
		Scanner input = new Scanner(System.in);
		System.out.println("Give your name: ");
		String name = input.nextLine();
		System.out.println("Give your surname: ");
		String surname = input.nextLine();
		System.out.println("Give your time of life: ");
		int time_of_life = input.nextInt();
		input.nextLine();
		System.out.println("Give your nationality: ");
		String nationality = input.nextLine();
		System.out.println("Thank you " + name);
		System.out.println("There are your identity informations: ");
		System.out.println("Name: " + name );
		System.out.println("Surname: " + surname );
		System.out.println("Age: " + time_of_life);
		System.out.println("Nationality: " + nationality);
		input.close();
	}
}
