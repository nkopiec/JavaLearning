package pl.java;

public class Trojka {

	private double a, b, c;
	
	public Trojka(double x, double y, double z) {
		a = x;
		b = y;
		c = z;
	}
	
	public double sum() {
		return a + b + c/3;
	}
	
	public double average() {
		return (a + b + c)/3;
	}
	public void increase() {
		a++;
		b++;
		c++;
	}
	
	public void report() {
		System.out.println("Suma " + sum());
		System.out.println("Srednia " + average());
	}
}
