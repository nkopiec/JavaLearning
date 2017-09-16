package pl.java;

public class Variables {
	public static void main(String[] args) {
		System.out.println(1000 - 100 - 50 + 200);
		char letter = ':';
		System.out.println(letter);
		long number = 4567;
		System.out.println(number);
		float dot = 345.67F;
		System.out.println(dot);
		String label = "ala ma kota";
		System.out.println(label);
		String labelCopy = label;
		System.out.println(labelCopy);
		boolean logic = true;
		System.out.println(logic);
		String unicodeChar = "\u0040";
		System.out.println(unicodeChar);
		final int FINAL_INT;
		FINAL_INT = 34;
		final int SECOND = 67;
		System.out.println("" + FINAL_INT + " " + SECOND);
		int a = 5, b = 4;
		System.out.println(a - b);
		countComputerPrice();
	}
	
	public static void countComputerPrice() {
		double part1 = 20.45;
		double part2 = 4567.23;
		final int VAT = 22;
		double price = (part1 + part2) * VAT;
		System.out.println(price);	
	}
}
