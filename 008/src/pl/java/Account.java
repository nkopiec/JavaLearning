package pl.java;

public class Account {
	
	
	private double balance;
	private double monthIncome;
	private double monthExpend;
	private double interest;
	
	public Account(double s, double wpl, double wypl, double p) {
		balance = s;
		monthIncome = wpl;
		monthExpend = wypl;
		interest = p;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public int getMonthsToBalance(double targetBalance) {
	
		int n = 0;
		double diff = targetBalance - balance;
		while (diff > 0) {
			n++;
			balance *= (1 + (interest/100)/12);
			balance += monthIncome - monthExpend;
			double prevDiff = diff;
			diff = targetBalance - balance;
			if (prevDiff <= diff) return -1;
		}
		return n;
	}
	
	public double getBalanceAfter(int n) {
		double wspOds = (interest/100)/12;
		for (int i = 1; 1 <= n; i++)
			balance += wspOds*balance + monthIncome - monthExpend;
		return balance;
	}

}

