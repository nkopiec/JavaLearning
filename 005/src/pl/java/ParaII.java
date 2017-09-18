package pl.java;

public class ParaII {
	private int a;
	private int b;
	
	public ParaII(int x, int y) {
		a = x;
		b = y;
	}
	
	public void set(ParaII p) {
		a = p.a;
		b = p.b;
	}
	
	public ParaII add(ParaII p) {
		ParaII wynik = new ParaII(a, b);
		wynik.a += p.a;
		wynik.b += p.b;
		return wynik;
	}
	
	public void show(String s) {
		System.out.println(s + " ( " + a + " , " + b + " )" );
	}
}
