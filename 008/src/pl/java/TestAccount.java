package pl.java;

public class TestAccount {
	
	public static void main(String[] args) {
		
		Account ac = new Account(2000, 2400, 1800, 10);
		int lMies = ac.getMonthsToBalance(10000);
		double cel = 10000;
		int m = ac.getMonthsToBalance(cel);
		System.out.println("Miesi�ce do osi�gni�cia co najmniej " + cel + ":");
		System.out.println(m + " --- stan konta " + ac.getBalance());
	}

}
