package pl.java;

public class Circle extends Figure {

	private double ray;
	public Circle() {
		this(1.0);
	}
	public Circle(double r) {
		this(r, "Purple", true);
	}

	public Circle(double r, String c, boolean i) {
		super(c, i);
		ray = r;
		
	}
	public double calculateCircuit() {
		return 2*Math.PI*ray;
	}
	
	public double calculateArea() {
		return Math.PI*ray*ray;
	}
	
	public String toString() {
		return "Circle:" + "Circuit are aqual:" + calculateCircuit() + "Area are equal:" + calculateArea() + "Color:" + super.color + super.toString();
	}

	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println(circle);
	}

}
