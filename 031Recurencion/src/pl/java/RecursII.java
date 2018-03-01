package pl.java;

public class RecursII {

	
		public static void show2(int i) {
			if (i > 10) return;
			show2(i+1);
			System.out.println("show2" + i);
		}
		public static void main(String[] args) {
			show2(1);
	}

}
