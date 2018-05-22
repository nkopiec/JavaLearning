package pl.java;

public abstract class AbstractI {
	public static final int quantity = 2;

	public abstract String Child();

	public static void Run(int distance, int speed) {
		double time = (double)distance/speed;
		System.out.println("youre time is:  "+ time);	
	
	}
}
