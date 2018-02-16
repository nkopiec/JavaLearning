package pl.java;

public class Naan {

	public static void main(String[] args) {
		double d = 1.0 / 0.0;
		System.out.println("d = " + d);
		if (d == Double.POSITIVE_INFINITY) System.out.println("to jest + nieskoñczonoœæ");
		d = -1.0 / 0.0;
		System.out.println("d = " + d);
		if (d == Double.NEGATIVE_INFINITY) System.out.println("to jest -nieskoñczonoœæ");
		d = 0.0 / 0.0;
		System.out.println("d = " + d);
		if (d == Double.NaN) System.out.println("To nie jest liczba");
		else System.out.println("to jest liczba");
		Double dd = new Double(d);
		System.out.println("naprawdê: to nie jest liczba ? - " + dd.isNaN());

	}

}
//285