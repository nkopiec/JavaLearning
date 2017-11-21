package pl.java;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int[] array = {1, 4, 8, 5};
		for(int i = 0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		for(int x:array) {
			System.out.println(x);
		}
		System.out.println(Arrays.toString(array));
		int[] copy = new int[4];
		
	}

}
