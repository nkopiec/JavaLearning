package pl.java;

public class Ractangle extends Figure {
	private double sideA;
	private double sideB;
	
	
	public Ractangle() {
		this(12.3, 12.4, "Black", false);
	}
	

	public Ractangle(double a, double b, String c, boolean i) {
		super(c, i);
		sideA = a;
		sideB = b;
	}
	public double calculateArea() {
		return sideA*sideB;
	}
	public double calculateCircuit() {
		return 2*(sideA + sideB);
	}
	public String toString() {
		return "Name:" + getClass().getName() + "\n" + "Ractangle:" + "Area:" + calculateArea() + "Circuit" + calculateCircuit() + "\n" + super.toString();
	}

	public static void main(String[] args) {
		Ractangle ractangle = new Ractangle();
		System.out.println(ractangle);
	}

}
