package pl.java;

import java.util.concurrent.FutureTask;

public class BalanceFuture extends FutureTask<Integer> {
	private String name;
	
	public BalanceFuture(String name, BalanceTask btask) {
		super(btask);
		this.name = name;
	}
	
	protected void done() {
		String msg = name;
		try {
			msg += "konczy z wynikiem " + get();
		} catch (Exception exc) {
			msg += "konczy wyjatkiem " + exc;
		}
		System.out.println(msg);
	}

}
