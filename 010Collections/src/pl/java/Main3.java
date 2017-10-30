package pl.java;

public class Main3 {
	public static void main(String[] args) {
		Main3 m = new Main3();
		m.className();
		System.out.println(m.sqrt(5));
		System.out.println(m.sqrt(53));
		System.out.println(m.sqrt(10));
		System.out.println(m.sqrt(10.67));
		System.out.println(m.sqrt(44.23));
	}
	
	public void className() {
		System.out.println("Main3");
	}
	
	public int sqrt(int a ) {
		return a*a;
		
	}
	public double sqrt(double a ) {
		return a*a;
	}
}
