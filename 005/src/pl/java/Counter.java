package pl.java;

import pl.java.packing.Disk;

public class Counter {

		private static int objectCount;
		private int counter;
		
		public Counter() {
			objectCount++;
		}
		
		public void increase() {
			counter++;
		}
		
		public void report() {
			System.out.println("Stworzono obiektów " + objectCount);
			System.out.println("Licznik w obiekcie " + counter);
		}
		
		public static void main(String[] args) {
			Counter s1 = new Counter();
			s1.increase();
			s1.increase();
			s1.report();
			
			Counter s2 = new Counter();
			s2.report();
			Disk.setVat(12.23);
		}
}
