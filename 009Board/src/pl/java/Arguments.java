package pl.java;

public class Arguments {
	public static void main(String[] args) {
		System.out.println("Length of args: " + args.length);
		
		if (args.length != 2) {
			System.out.println("Must input exactly 2 arguments!");
			System.exit(1);
		}
		
		for (int i = 0; i < args.length; i++) {
			System.out.println("Element " + i + " equals: " + args[i]);
		}
		for (String element : args) {
			System.out.println(element);
		}
		
		
		int[] tab = new int[] { 3, 4, 6, 8, 9 };		
		long f1 = sum(tab);
		System.out.println(f1);
		f1 = sum(new int[] {3, 4, 6, 8, 10});
		System.out.println("Sum of array equals: " + f1);
		
		f1 = sum1(tab);
		System.out.println("Sum of array equals: " + f1);
		f1 = sum1(1, 2, 3, 4);
		System.out.println("Sum of array equals: " + f1);
		f1 = sum1();
		System.out.println("Sum of array equals: " + f1);
	}
	
	
	public static long sum(int[] tab) {
		int sum = 0;
		for (int i = 0; i < tab.length; i++) {
			sum = tab[i] + sum;
		}
		return sum;
	}
	
	public static long sum1(int ... elements) {
		int sum = 0;
		System.out.println("Array elements: " + elements.length);
		for (int element : elements) {
			sum = sum + element;
		}
		return sum;
	}
}
