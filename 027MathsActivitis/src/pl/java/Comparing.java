package pl.java;

import java.math.BigDecimal;

public class Comparing {

	public static void main(String[] args) {
		BigDecimal liczbaA = new BigDecimal("3");
		BigDecimal liczbaB = new BigDecimal("0.2");
		BigDecimal wynik = liczbaA.multiply(liczbaB);
		if (!wynik.equals(new BigDecimal("0.6"))) 
			System.out.println("nie s¹ równe");
			else System.out.println("rówme");
		
		BigDecimal
		licz2 = new BigDecimal("0.11111111111111111111111"),
		licz1111= new BigDecimal("1111"),
		licz3 = licz1111.add(licz2),
		licz4 = licz3.subtract(licz1111);
		
		System.out.println(licz3);
		System.out.println(licz4);
		System.out.println(licz4.subtract(licz2).toPlainString());
	}

}
