package pl.java;

class Task implements Runnable {
	private String name;
	private final int N;
	
	public Task(String name, int n) {
		N = n;
		this.name = name;
	}
Thread t = new Thread (new Runnable() {
	@Override
	public void run() {
		for (byte b = 0; b< 128; b++) {
			if (Thread.interrupted())
				return;
			System.out.println(b);
			t.start();
		}
	}
});
	public void run() {
		int sum = 0;
		for (int i=1, k = 0; i <= N; i++) {
			if (i%1000 == 0)
				System.out.println(name + " ... count " + (k+=1000));
			sum += i;
			t.interrupt();	
		}
		System.out.println(name + ", sum = " + sum);
	}

}
