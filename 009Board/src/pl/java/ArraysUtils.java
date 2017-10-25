package pl.java;

import java.util.Arrays;

public class ArraysUtils {
	public static void main(String[] args) {
		int[] tab = new int[100];
		System.out.println(Arrays.toString(tab));
		
		Arrays.fill(tab, 100);
		System.out.println(Arrays.toString(tab));
		
		int[] tab2 = Arrays.copyOf(tab, 5);
		System.out.println(Arrays.toString(tab2));
		
		int[] tab3 = Arrays.copyOfRange(tab, 3, 5);
		System.out.println(Arrays.toString(tab3));
	}
}
