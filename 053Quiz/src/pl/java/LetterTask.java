package pl.java;

public class LetterTask implements Runnable {
	private String lett;
	
	public LetterTask(String lett) {
		this.lett = lett;
	}
	
	public void run() {
		String out;
		outLoop: while(true) {
			out = "";
			for (int i = 0; i < 20000; i++) {
				if (Thread.interrupted()) break outLoop;
				out += lett;
			}
			System.out.println(lett);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException exc) {
				break;
			}
		}
		System.out.println(lett + " length = " + out.length());
		
		
	}

}
