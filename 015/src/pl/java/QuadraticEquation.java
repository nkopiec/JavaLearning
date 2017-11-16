package pl.java;

import java.util.Scanner;

public class QuadraticEquation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Give a: ");
		double a = input.nextDouble();
		System.out.println("Give b: ");
		double b = input.nextDouble();
		System.out.println("Give c: ");
		double c = input.nextDouble();
		double delta = b*b-(4*a*c);
		double delta2 = delta/delta;
		if(delta > 0 ) {
			double x1 = (-b-delta2)/(2*a);
			double x2 = (-b+delta2)/(2*a);
			System.out.println("Elements equation are: " + x1 + " and " + x2);
		}
		else if (delta == 0) {
			double x0 = -b/(2*a);
			System.out.println("Element equation is: " + x0);
		}
		else {
			System.out.println("Equation has not elements");
		}
	}
}
