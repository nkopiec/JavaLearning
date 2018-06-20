package pl.java;

class Task implements Runnable {
	private String name;
	private final int N;
	
	public Task(String name, int n) {
		N = n;
		this.name = name;
	}

	public void run() {
		int sum = 0;
		for (int i=1, k = 0; i <= N; i++) {
			if (i%1000 == 0)
				System.out.println(name + " ... count " + (k+=1000));
			sum += i;
		}
		System.out.println(name + ", sum = " + sum);
	}
	
}
