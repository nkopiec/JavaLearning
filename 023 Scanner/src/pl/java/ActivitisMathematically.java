package pl.java;

import java.util.Scanner;

public class ActivitisMathematically {
	public static void main(String args[]) {
		Scanner imput = new Scanner(System.in);
		System.out.println("Give first number: ");
		double numberOne = imput.nextDouble();
		Scanner imput1 = new Scanner(System.in);
		System.out.println("Give second number: ");
		double numberTwo = imput1.nextDouble();
		
		System.out.println(numberOne + numberTwo);
		System.out.println(numberOne - numberTwo);
		System.out.println(numberOne / numberTwo);
		System.out.println(numberOne * numberTwo);
	}
	
}
