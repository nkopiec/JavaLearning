package pl.java;

import java.util.Arrays;

public class SortII {

	public static void main(String[] args) {
		int[] a = {23, 12, 89, 11};
		int q = a[3];
		a[3] = a[2];
		a[2] = q;
		System.out.println(a[3] );
		int x = a[0];
		a[0] = a[2];
		a[2] = x;
		System.out.println(a[2]);
		int z = q;
		q = a[0];
		a[0] = z;
		System.out.println(a[0]);
		
		int[] b = {12, 34, 23, 1, 77 };
		Arrays.sort(b);
		System.out.println(b[0]);
		
		
	}
}
 