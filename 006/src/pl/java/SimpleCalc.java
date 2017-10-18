package pl.java;

public class SimpleCalc {
	
	private double a;
	private double b;
	
	public SimpleCalc(double x, double y) {
		a = x;
		b = y;
	}
	
	public double makeOp(char op) {
		
		double r = 0;
		switch(op) {
		case '+' : r = a + b; break;
		case '-' : r = a - b; break;
		case '*' : r = a * b; break;
		case '/' : r = a / b; break;
		default : System.out.println("Nieznany kod operacji");
		}
		
		return r;
	}

}
