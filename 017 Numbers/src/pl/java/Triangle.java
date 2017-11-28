package pl.java;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Give length basis your triangle: ");
		int basis = input.nextInt();
		
		System.out.println("Give length first arm your triangle: ");
		int arm1 = input.nextInt();
		
		System.out.println("Give length second arm your triangle: ");
		int arm2 = input.nextInt();
		
		int arms = arm1 + arm2;
		
		if (arms > basis) {
			System.out.println("You give good measurements, it is trangle");
		}
		else if (basis >= arms ) {
			System.out.println("You give bad measurements, it isn't trangle");
		}

	}

}
