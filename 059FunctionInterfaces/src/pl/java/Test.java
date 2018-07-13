package pl.java;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test implements Callable {
	public Object call() throws Exception {
	ExecutorService ex = Executors.newCachedThreadPool();
	Future<String> task = ex.submit( () -> {
		String s = null;
		char[] src = s.toCharArray();
		char[] trg = new char[src.length];
		for(int i = src.length-1, j=0; i >= 0; i--, j++) {
			trg[j] = src[i];
			System.out.println(trg[j]);
			Thread.sleep(1000);
		}
		return new String(trg);
	}
	);
	String res = task.get();
	
		return res;
	}
	public static void main(String[] args) throws Exception {
		Future<String> task = null;
		String res = task.get();
		System.out.println(res);
	}
}
