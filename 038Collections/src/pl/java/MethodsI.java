package pl.java;

import java.util.LinkedList;

public class MethodsI {

	public static void main(String[] args) {
		methodI();
	}

	public static void methodI() {
		LinkedList<String> animals = new LinkedList<>();
		animals.add("DOG");
		animals.add("CAT");
		animals.add("SNAKE");
		animals.add("ELEPHANT");
		
		System.out.println(animals.isEmpty());
		System.out.println(animals.size());
		System.out.println(animals.lastIndexOf("DOG"));
		
	}
}
