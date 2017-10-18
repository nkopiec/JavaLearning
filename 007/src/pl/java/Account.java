package pl.java;

public class Account {
	
	private double balance;
	
	public void withdraw(double d) throws IllegalArgumentException {
		if (d <= 0) throw new IllegalArgumentException("Withdrawal should be > 0");
		if (balance - d <0)
			throw new IllegalArgumentException("Withdrawal exceeding balance not allowed");
		balance -= d;
	}
	

}
