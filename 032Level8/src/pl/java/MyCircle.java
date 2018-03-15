package pl.java;

public class MyCircle extends Circle{
	
	public MyCircle(double r) {
		super(r);
	}
	public double calculateArea() {
		double r = getRay();
		return 1000*r;
	}

	public static void main(String[] args) {
		MyCircle mc = new MyCircle(100);
		System.out.println("Ray: " + mc.getRay());
		System.out.println("Circuit: " + mc.calculateCircuit());

	}

}
// l 26 t 7.00