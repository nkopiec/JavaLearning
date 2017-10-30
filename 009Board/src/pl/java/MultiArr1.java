package pl.java;

import java.util.Arrays;

public class MultiArr1 extends Object{
	
	public static void main(String[] args) {
		int w[][] = { { 1, 2, 3 }, { 4, 5, 6} };
		int n = 2;
		int[][] got1 = new int[n][];
		
		for(int[] tab : got1) {
			System.out.println(Arrays.toString(tab));
		}
		
		for (int i = 0; i < got1.length; ++i) {
			got1[i] = new int[w[i][1]];
			
		}
		
		for(int[] tab : got1) {
			System.out.println(Arrays.toString(tab));
		}
	}

}
