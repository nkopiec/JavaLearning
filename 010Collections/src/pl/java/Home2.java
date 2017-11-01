package pl.java;

import Animal.Dog;;


public class Home2 {
	
	public static void main(String args[]) {
		Dog dog = new Dog();
		int i = 35;
		double j = i;
		int a = 56;
		int b = (int)a;
		System.out.println(b);
		System.out.println(recursion(10));
	
	}

	
	public static int recursion(int a ) {
		if (a==0)
			return 1;
		else
			return a*resursia(a-1);
	}


	private static int resursia(int i) {
		
		return 1;
		// nie dzia³a silnia 
	}
	public static void enums() {
		EnumTest et = EnumTest.SMALL;
		System.out.println(et.getSize(et));
	}
}
