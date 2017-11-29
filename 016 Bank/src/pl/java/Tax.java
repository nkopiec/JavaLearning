package pl.java;

import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Give your income: ");
		int income = input.nextInt();
			
			if (income < 85528) {
				double tax = (income * 0.18) - 556.02;
				System.out.println("Your tax well bee total " + income + "z³");
			} else if (income > 85528) {
				double tax = 14839.02 + ((85528 - income) * 0.32);
				System.out.println("Your tax well bee total " + income + "z³");
			}
	}

}
