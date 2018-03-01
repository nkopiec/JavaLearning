package pl.java;

public class RecursI {

	
		public static void show1(int i) {
			System.out.println("show1 " + i);
			if (i > 10) return;
			show1(i+1);
		}
		
		
		public static void main(String[] args) {
			show1(1);
			
		}
		
}
