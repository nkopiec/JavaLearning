package pl.java;

public class TestIII {
	
	public static int fib (int n) {
		if (n < 2) {
			return n;
		} else {
			return fib(n-1) + fib(n-2);
		}
		
	} 
	
	public static void main(String[] args) {
		TestIII test = new TestIII();
		System.out.println(test.fib(12));
		System.out.println(fib(12));
	  
	}
}
