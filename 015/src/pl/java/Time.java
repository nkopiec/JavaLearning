package pl.java;

public class Time {

	public static void main(String[] args) {
		long t1 = System.currentTimeMillis();
		for(int i=0; i<1E6; i++){
			double x = Math.pow(Math.random(), Math.random());
		}
		long t2 = System.currentTimeMillis();

		System.out.println((t2-t1)/1000.0);
	}

}
