package pl.java;

public class QTimer {


	public static void main(String[] args) {
		System.out.println();
	}
		private long start; 
		private long elapsed;
		private boolean counting;
		private boolean measured;
		
		private QTimer start() {
			if (counting) emsg("Can'tstart counting timer");
			counting = true;
			measured = false;
			start = System.nanoTime();
			return this;
		}
		public QTimer stop() {
			if (!counting) emsg("Can't stop running timer");
			elapsed = System.nanoTime() - start;
			counting = false;
			measured = true;
			return this;
		}
		public long elapsed() {
			if (!measured) emsg("Elapsed time not measured yet");
			return elapsed;
		}
		public String toString() {
			if (!measured) emsg("Elapsed time not measured yet");
			return "Time: " + elapsed + " ns, " +
					"that is: " + 1.*elapsed/1_000_000_000 + " sek.";
		}
		private void emsg(String msg) {
			throw new RuntimeException(msg);
		}
		
		
		
			
		
	

}
