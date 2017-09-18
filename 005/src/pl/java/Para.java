package pl.java;

public class Para {
	private int a;
	private int b;
	
	public Para(int a, int b) {
		this.a = a;
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
 