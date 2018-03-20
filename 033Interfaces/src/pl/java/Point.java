package pl.java;

public class Point implements Movable2D {
	private double x;
	private double y;
	
	public Point (double x, double y) {
		this.x = x;
		this.y = y;
		
	}
	public void move(double x, double y) {
		this.x += x;
		this.y += y;
	}
	public void getPosition() {
		System.out.println("x: " + x + "y: " + y );
	}
}

