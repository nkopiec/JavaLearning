package pl.java;

public class Continue {
	public static void main(String[] args) {
		for(int i = 1; i < 123; i++){
			if (i % 2 == 1) {
				System.out.println(i);
				continue;
			}
			while (i % 2 != 1) {
				System.out.println(i);
				break;
			}
		}
	}
}
