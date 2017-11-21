package pl.java;

public class Transmission1 {
	public static void doubling(int[] x, int[] y) {
		for(int i = 0; i < x.length; i++) {
		y[i] = x[i] * 2;
	}
}
	public static void main(String[] args) {
		int[] x = new int[1];
		int[] y = new int[1];
		x[0] = 10;
		System.out.println("Walue x : " + x[0]);
		doubling(x, y);
		System.out.println("Walue y : " + y[0]);
	}

}
