package pl.java;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureFib extends FutureTask<Long> {
	private Callable<Long> proc;
	
	public FutureFib(Callable<Long> proc) {
		super(proc);
		this.proc = proc;
	}
	protected void done() {
		String msg = "wynik: " + proc + " = ";
		if (this.isCancelled()) msg += " ... zadanie anulowane";
		else try {
			msg += this.get();
		} catch (InterruptedException | ExecutionException exc) {
			msg += " ... powst³ wyatk " + exc;
		}
		System.out.println(msg);
	}

}
