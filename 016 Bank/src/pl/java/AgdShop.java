package pl.java;

import java.util.Scanner;

public class AgdShop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Give price for yours device: ");
		int price = input.nextInt();
		System.out.println("How many instalments you want have?: ");
		int instalments = input.nextInt();
			if (instalments <= 12) {
				double money = price * 0.025 / instalments;
				System.out.println("Your instalments will be total " + money + "z³");
			} else if (instalments >= 13 || instalments <= 24 ) {
				double money = price * 0.5 / instalments;
				System.out.println("Your instalments will be total " + money + "z³");
			} else if (instalments >= 25) {
				double money = price * 0.10  / instalments;
				System.out.println("Your instalments will be total " + money + "z³");
			}
	}

}
