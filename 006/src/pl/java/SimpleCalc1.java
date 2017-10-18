package pl.java;

public class SimpleCalc1 {
	enum Op { PLUS, MINUS, MULT, DIV };
	
	private double a;
	private double b;
	
	public SimpleCalc1(double x, double y) {
		a = x;
		b = y;
	}
	
	public double makeOp(Op op) {
		
		double r = 0;
		
		switch(op) {
		case PLUS : r = a + b; break;
		case MINUS : r = a - b; break;
		case MULT : r = a * b; break;
		case DIV : r = a / b; break;
		default : System.out.println("Nieznany kod operacji");
		}
		
		return r;
	}

}
