package pl.java;

public class Timer implements Runnable {
		public void run() {
			int time = 0;
			while (true) {
				try {
					Thread.sleep(1000);
				} catch(InterruptedException exc) {
					System.out.println("watek zliczania czasu zosta³ przerwany");
					return;
				}
				time++;
				int minutes = time/60;
				int sec = time%60;
				System.out.println(minutes + ":" + sec);
			}
		}

}
