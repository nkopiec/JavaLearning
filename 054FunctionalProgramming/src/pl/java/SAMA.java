package pl.java;

import java.util.Collection;

public interface SAMA {
	void doWork(int n);
}

interface SAMB {
	void doWork(String s);

	boolean equals();
}

interface SAMC {
	void doWork(Collection c);
	default public void done() {
		System.out.println("Done");
	}
}


