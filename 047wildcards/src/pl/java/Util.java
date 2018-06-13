package pl.java;

import java.util.ArrayList;

public class Util {
	public static void write1(ArrayList<? extends Number> arg1) {
		System.out.println(arg1.get(0));
	}
	
	public static void write2(ArrayList<? super Number> arg1) {
		System.out.println(arg1);
	}
	
	public static void write3(ArrayList<?> arg1) {
		System.out.println(arg1);
	}
}
