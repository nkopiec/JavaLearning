package pl.java;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class StringTab {
	private String[] txt;
	private Lock lock = new ReentrantLock();
	
	
	public void set(int i, String s) {
		lock.lock();	
		txt[i] = s;
		lock.unlock();
	}
	public String get(int i) {
		lock.lock();
		try {
		return txt[i];
		} finally {
			lock.unlock();
		}
	}
	
	Lock lock1 = new ReentrantLock();
	
	Runnable task1 = new Runnable() {
		public void run() {
			System.out.println("task 1 begins");
			try {
				lockInterruptiibly();
				System.out.println("task 1 entered");
			} catch(InterruptedException exc) {
				System.out.println("task 1 interrupted");
			} finally {
				lock.unlock();
			}
			System.out.println("task 1 stopped");
		}
	}
	
}
}
