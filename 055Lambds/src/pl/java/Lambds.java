package pl.java;

public class Lambds {
	public static void main(String[] args) {
		Calculator addition = (int a, int b) -> a + b;
		Calculator subtraction = (int a, int b) -> a - b;
		Calculator multiplication = (int a, int b) -> a * b;
		Calculator division = (int a, int b) -> a / b;
		
		System.out.println(addition.calculate(6, 10));
		System.out.println(subtraction.calculate(45, 18));
		System.out.println(multiplication.calculate(47, 12));
		System.out.println(division.calculate(44, 19));
	
		Sentences goodOrder = (String x, String y) -> x + y;
		Sentences shiftOrder = (String x, String y) -> y + x;
		
		System.out.println(goodOrder.sentence("cat is ", "eating "));
		System.out.println(shiftOrder.sentence("cat is ", "eating "));
		
		Calculator2 addition2 = (double c, double d) -> c + d;
		Calculator2 subtraction2 = (double c, double d) -> c - d;
		Calculator2 multiplication2 = (double c, double d) -> c * d;
		Calculator2 division2 = (double c, double d) -> c / d;
		
		System.out.println(addition2.calculate2(6.0974, 10.234));
		System.out.println(subtraction2.calculate2(45.4, 18.764));
		System.out.println(multiplication2.calculate2(47.33333, 12.437777));
		System.out.println(division2.calculate2(44.2343, 19.2213));
	}
}
