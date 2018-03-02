package pl.java;

public class TestIV {
	int[] calls;
	private void ShowFibRec(int n ) {
		calls = new int[n+1];
		fib(n);
		for(int i=0; i <= n; i++)
			System.out.println("numbers arguments fib" + 1 + " " + calls[i]);

	}
	int fib(int n) {
		calls[n]++;
		if (n < 2) return n;
		else return fib(n-1) + fib(n-2);
		
	}
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		//new ShowFibRec(n);

	}

}
