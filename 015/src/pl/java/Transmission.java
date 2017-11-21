package pl.java;

public class Transmission {
	public static void doubling(int[] x) {
		for(int i = 0; i < x.length; i++) {
		x[i] = x[i] * 2;
	}
}
	public static void main(String[] args) {
		int[] x = new int[1];
		x[0] = 10;
		System.out.println("Walue x before doubling: " + x[0]);
		doubling(x);
		System.out.println("Walue x after doubling: " + x[0]);
	}

}
