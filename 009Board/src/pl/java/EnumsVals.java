package pl.java;

public class EnumsVals {
	
	enum Month {
		JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
	}

	public static void main(String[] args) {
		
		for (Month m : Month.values()) {
			System.out.print(" " + m);
			if (m == Month.JUN) System.out.println();
		}
	}
}
