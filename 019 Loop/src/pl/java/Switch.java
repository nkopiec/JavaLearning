package pl.java;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner imput = new Scanner(System.in);
		
		System.out.println("1) Add, \n2) Subtraction, \n3) Multiplication , \n4) Division ");
		System.out.println("Choose one: ");
		String choose = imput.nextLine();
		System.out.println("Give first number: ");
		int first = imput.nextInt();
		System.out.println("Give second number: ");
		int second = imput.nextInt();		
		
		
		
		switch(choose) {
		case ("1"):
			int result = first + second;
			System.out.println("Yours result is: " + result);
			break;
		case ("2"):
			int result1 = first - second;
			System.out.println("Yours result is: " + result1);
			break;
		case ("3"):
			int result2 = first * second;
			System.out.println("Yours result is: " + result2);
			break;
		case ("4"):
			double result3 = first / second;
			System.out.println("Yours result is: " + result3);
			break;
		}
	}
}
