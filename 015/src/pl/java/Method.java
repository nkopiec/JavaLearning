package pl.java;


public class Method {
	public static void main(String[] args) {
		writeout();
		
	System.out.println(multiplication());
	equals();
	System.out.println("Perimeter squer is: " + perimeterSquer(10, 12));
	}
		public static double perimeterSquer(int i, int j) {
			double perimeterSquer = i*j;
			return perimeterSquer;
	}
		public static void writeout() {
			int a = 10;
			if(a >= 0) {
				System.out.println(" A is positive");
			}
			else {
				System.out.println(" A is negative");
			}
			
		}
		public static int multiplication() {
			int b = 123;
			int c = 5;
			int d = b*c;
			return d;
			
		}
		
		public static void equals() {
			int a = 5;
			switch(a) {
				case 4:
				System.out.println("a = 4");
				break;
			default:
				System.out.println("a != 4");
				break;
			}
			
		
		
			
				
		}
}
