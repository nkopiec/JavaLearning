package pl.java;

import javax.swing.JOptionPane;

import pl.java.SimpleCalc1.Op;


public class Instructions {
	public static void main(String[] args) {
		int a = 2;
		int b = 2;
		int c = 5;
		int d = 7;
		int e = 4;
		if (a == b) c = d;
		c = e;
		System.out.println( a + " " + b + " " + c + " " + d );
		if (a >= 0) if (a <= 100) System.out.println( "a w przedziale od 0 do 100");
		else System.out.println("a mniejsze od 0");
		
		SimpleCalc sc = new SimpleCalc(1.2, 3.7);
		System.out.println( sc.makeOp('+'));
		System.out.println( sc.makeOp('-'));
		System.out.println( sc.makeOp('*'));
		System.out.println( sc.makeOp('/'));
		
		
		SimpleCalc1 sc1 = new SimpleCalc1(1.2, 3.7);
		System.out.println( sc1.makeOp(Op.PLUS));
		System.out.println( sc1.makeOp(Op.MINUS));
		System.out.println( sc1.makeOp(Op.MULT));
		System.out.println( sc1.makeOp(Op.DIV));
		
		String animal = JOptionPane.showInputDialog("Podaj zwierzaka");
		switch(animal) {
			case "Pies": System.out.println("Hau, hau, hau..."); break;
			case "Kot": System.out.println("Mia³, mia³, mia³..."); break;
			case "Krowa": System.out.println("Muu..."); break;
			case "Koñ": System.out.println("Ihaaa..."); break;
			default: System.out.println("Nie znam"); break;
		}
		
		int a1 = 1, b1 = 0, c1 = 0;
		String wynik;
		try {
			c1 = a1/b1;
			wynik = "" + c1;
		}	catch (ArithmeticException exc) {
				wynik = "***";
			
		}
			System.out.println(c1);
			
		
		String s1 = JOptionPane.showInputDialog("Podaj pierwsz¹ liczbê");
		if (s1 != null) {
			String s2 = JOptionPane.showInputDialog("Podaj drug¹ liczbê");
			if (s2 != null) {
				int n1;
				int n2;
				try {
					n1 = Integer.parseInt(s1);
					n2 = Integer.parseInt(s2);
				} catch (NumberFormatException exc) {
					System.out.println("B³êdne dane - koñczê dzia³anie");
					return;
				}
				JOptionPane.showMessageDialog(null, "Suma: " + (n1 + n2));
			}
		}

		
	String z1 = JOptionPane.showInputDialog("Podaj kwotê PLN");
	if (z1 != null) {
		int u1;
		try {
			u1 = Integer.parseInt(z1);
		} catch (NumberFormatException exc) {
			System.out.println("B³êdne dane - koñczê dzia³anie");
			return;
		}
		JOptionPane.showMessageDialog(null, "Przelicznik: " + (u1 * 0.27) + "USD");
	}
	
	
	String v1 = JOptionPane.showInputDialog("Wybierz walute:\n EUR,\n USD,\n GBP.\n");
	if (v1 != null) {
		String v2 = JOptionPane.showInputDialog("Wybierz walute:\n EUR,\n USD,\n GBP.\n");
			if (v2 != null) {
				String v3 = JOptionPane.showInputDialog("Wybierz walute:\n EUR,\n USD,\n GBP.\n");
					if (v3 != null) {
						int EUR;
						int USD;
						int GBP;
						try {
							EUR = Integer.parseInt(v1);
							USD = Integer.parseInt(v2);
							GBP = Integer.parseInt(v3);
						} catch (NumberFormatException exc) {
							System.out.println("B³êdne dane - koñczê dzia³anie");
							return;
						}
						JOptionPane.showMessageDialog(null, "Przelicznik: " + (EUR / 0.23) + "PLN");
						JOptionPane.showMessageDialog(null, "Przelicznik: " + (USD / 0.27) + "PLN");
						JOptionPane.showMessageDialog(null, "Przelicznik: " + (GBP / 0.21) + "PLN");
					
					}
}
	}
	}
	
	}
                                                 

