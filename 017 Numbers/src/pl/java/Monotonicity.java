package pl.java;

import java.util.Scanner;
public class Monotonicity {
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Quote first figure");
			int first = input.nextInt();
			
			System.out.println("Quote second figure");
			int second = input.nextInt();
			
			System.out.println("Quote third figure");
			int third = input.nextInt();
			if (first > second & first > third ) {
				System.out.println("Figure " + first + " is the biggest");
			} else if (second > first & second > third) {
				System.out.println("Figure " + second + " is the biggest");
			} else if (third > first & third > second) {
				System.out.println("Figure " + third + " is the biggest");
			}
			if (first < second & first < third ) {
				System.out.println("Figure " + first + " is the smallest");
			} else if (second < first & second < third) {
				System.out.println("Figure " + second + " is the smallest");
			} else if (third < first & third < second) {
				System.out.println("Figure " + third + " is the smallest");
				
			}
			
	}
}