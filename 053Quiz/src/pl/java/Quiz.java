package pl.java;


import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Quiz {
	public static void main(String args[]) throws InterruptedException {
		Set<String> cap = new HashSet<>(
				Arrays.asList("Praga", "Bratyslawa", "Moskwa", "Berlin", "Kij�w", "Wilno", "Mi�sk"));
		Set<String> entered = new HashSet<>();
		showMessageDialog(null, "Podaj stolice: ");
		
		int count = 0;
		
		Timer timer = new Timer();
		Thread tt = new Thread(timer);
		tt.start();
		
		for(int n = cap.size(); count < n;) {
			String in = showInputDialog("Odpowiedz: " + count + "/" + n + '\n' + "wpisz nastepn� stolic�: ");
			
			if (in == null) break;
			in = in.toLowerCase();
			if (!entered.contains(in) && cap.contains(in)) {
				count++;
				entered.add(in);
			}
		}
		Executor exec = Executors.newFixedThreadPool(2);
		for (int i=1; i<=4; i++) {
			exec.execute(new Task("Task" + i, i*1000));
		}
		
		ExecutorService exec1 = Executors.newCachedThreadPool();
		ArrayList<Future<Long>> res = new ArrayList<>();
		for (Integer n : new int[] {17, 22, 43}) {
			Future<Long> fut = exec1.submit(new FibCall(n));
			res.add(fut);
			
			while (res.size() > 0) {
				Thread.sleep(10);
				for (Iterator<Future<Long>> it = res.iterator(); it.hasNext();) {
					Future<Long> fut1 = it.next();
					if (fut1.isDone()) {
						try {
							System.out.println("Result: " + fut1.get());
						} catch (InterruptedException | ExecutionException exc ) {
							System.out.println("W trakcie powsta� wyj�tek ");
						}
						it.remove();
						System.out.println("Remaining: " + res.size());
					}
				}
			}
			((ExecutorService) exec).shutdown();
		}
		
		ExecutorService exec2 = Executors.newCachedThreadPool();
		for (Integer n : new int[] {17, 22, 43}) {
			exec2.execute(new FutureFib(new FibCall(n)));
		}
		exec2.shutdown();
	}
	

	private static void showMessageDialog(Object object, String string) {
		// TODO Auto-generated method stub
		
	}

	private static String showInputDialog(String string) {
		// TODO Auto-generated method stub
		return null;
}


	private static void start() {
		// TODO Auto-generated method stub
		
	}
	
}

