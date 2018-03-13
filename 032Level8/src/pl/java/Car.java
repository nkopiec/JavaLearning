package pl.java;

public class Car {
	public static void main(String[] args) {
		write(10);
		write(new Direct());
		write(24, new Direct());
	}
	
	public static void write(int i) {
		System.out.println(i);
	
	}
	public static void write(Direct d) {
		System.out.println(d);
		
	}
	public static void write(int i, Direct d) {
		System.out.println(i + " " + d);
		
	}


}
