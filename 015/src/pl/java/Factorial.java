package pl.java;

public class Factorial {

	public static void main(String[] args) {
			
		int n = 10;
		long factorial = 1;
		for (int i = 1; i<=n; i++) {
			factorial = factorial  * i;
		}
		System.out.println("Factorial with " + n + " is equal " + factorial);
		System.out.println("Factorial with " + n + " is equal " + comteFactorial(n));
	}
	
	public static long comteFactorial(int n) {
		
		long factorial1 = 1;
		for (int j = 1; j<=n; j++) {
			factorial1 = factorial1  * j;
		}
		return factorial1;
		
	}

}
