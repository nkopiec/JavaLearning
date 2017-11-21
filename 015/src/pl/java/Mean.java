package pl.java;

public class Mean {
	public static void average(int... var) {
		double d = 0;
		for(int x : var) {
			d = d + x;
		}
		d = d/var.length;
		System.out.println("Average is: " + d);
	}
	public static void main(String[] args) {
		average(2, 3, 78, 12, 90);
	}

}
