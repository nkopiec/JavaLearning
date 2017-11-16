package pl.java;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Give your weight[kg]: ");
		int weight = input.nextInt();
		System.out.println("Give your height[cm]");
		int height = input.nextInt() ;
		System.out.println("It's your body mass index");
		double Height = (height * height)* 0.0001;
		double BMI = weight/Height;
		System.out.println(BMI);
		if (BMI < 18.4) {
			System.out.println("You have underweight!");
		}
			else if (BMI > 25) {
				System.out.println("You have surplus of weight!");
			}
			else {
				System.out.println("Your Body Mass Index is good");
			}
			
	}

}
