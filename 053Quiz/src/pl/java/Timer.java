package pl.java;

public class Timer extends Thread {
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
  

/*
 *
			new Thread(new Runnable() {
				public void run() {
					int time = 0;
					while (true) {
						try {
							Thread.sleep(1000);
						} catch (InterruptedException exc) {
							return;
						}
						System.out.println(++time);
					}
					
				}
				
			});.start();
			String s, out = "";
			while ((s = JOptionPane.showInputDialog("Tekst: " )) != null)
				out += " " + s;
			System.out.println(out); */
 