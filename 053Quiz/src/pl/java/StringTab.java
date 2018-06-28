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
}
