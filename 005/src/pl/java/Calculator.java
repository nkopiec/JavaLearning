package pl.java;

public class Calculator {
	private int a;
	private int b;
	
	public Calculator() {
	}
	
	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	public int sum() {
		int sum = a + b;
		return sum;	
	}
	
	public void show() {
		System.out.println(a + " " + b);
	}
}

