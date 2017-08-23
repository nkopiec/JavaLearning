package pl.natalia;

import java.util.Scanner;

public class Variables {
	public static void main(String[] args) {
		String chars = new String();
		System.out.println("Input data");
		Scanner scanner = new Scanner(System.in);
		chars = scanner.nextLine();
		System.out.println("Inputed below text");
		System.out.println(chars);
		scanner.close();
	}
}
