package pl.java;

import java.util.Scanner;

public class PlacingII {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is length your placing? ");
		int length = input.nextInt();
		
		System.out.println("What is lending rate in your bank? ");
		int lendingRate = input.nextInt();
		double lendingRate1 = lendingRate / 100.0;
		
		System.out.println("What amount you going to intended for placing?(in mounth) ");
		int amount = input.nextInt();
		input.nextLine();
		double saldo = 0;
		double baseValue = 0;
		
		for(int i = 0; i < length; length--) {
			saldo = saldo + (12 * amount);
			baseValue = (baseValue * lendingRate1) + saldo;
			saldo = baseValue;
		}
		System.out.println(saldo);
		
		
		input.close();
		
	}

}
