package pl.java;

import java.util.concurrent.Callable;

public class BalanceTask implements Callable<Integer>{
	private Balance b;
	private int count;
	
	public BalanceTask(Balance b, int count) {
		this.b = b;
		this.count = count;
	}
	
	public Integer call() throws Exception {
		int wynik = 0;
		for (int i = 0; i < count; i++) {
			wynik = b.balance();
			if (wynik != 0) break;
		}
		return wynik;
	}
}
