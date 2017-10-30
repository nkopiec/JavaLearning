package pl.java;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] agrs) {
		int a = 8;
		if(a < 10) {
			System.out.println("a < 10");
		} else if(a == 10) {
			System.out.println("a = 10");
		} else {
			System.out.println("a > 10");
		
		}
		
	int b =4;
	
	
		switch (b) {
			case 1:
				System.out.println("b = 1");
				break;
			case 2:
				System.out.println("b = 2");
				break;
			case 3:
				System.out.println("b = 3");
				break;
			case 4:
				System.out.println("b = 4");
				break;
			case 5:
				System.out.println("b = 5");
				break;
			default:
				System.out.println("default");
	
		}
	
		int c = 10;
		int d;
		d = c < 10 ? -1 : 1;
		System.out.println(d);
		
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
			if ( i == 5) {
				break;
			}
			
		Scanner scanner = new Scanner(System.in);
		
		String name;
		
		scanner.next();
		
		System.out.println();
				
		}
	}
}
