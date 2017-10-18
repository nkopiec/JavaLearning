package pl.java;

public class Work {

	double sum(double a, double b, double q) {
		return a + b + q;
	}
	
	double average(double a, double b, double q) {
		return (a + b + q) / 3;
	}
	
	void report(double a, double b, double q) {
		System.out.println("Suma " + sum(a, b, q));
		System.out.println("Srednia " + average(a, b, q));
	}
	
}
