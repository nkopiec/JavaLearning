package pl.java;

import java.util.LinkedList;

public class Methods {

	public static void main(String[] args) {
		method();
	}
	public static void method() {
		LinkedList<String> listWithNames = new LinkedList<>();
		listWithNames.add("Piotr");
		listWithNames.add("Krzysiek");
		
		LinkedList<String> otherListWithNames = new LinkedList<>();
		otherListWithNames.add("Marek");
		otherListWithNames.addAll(listWithNames);
		otherListWithNames.add("Marek");
		
		System.out.println(otherListWithNames.contains("Marek"));
		System.out.println(otherListWithNames.get(0));
		System.out.println(otherListWithNames.isEmpty());
		System.out.println(otherListWithNames.indexOf("Marek"));
		System.out.println(otherListWithNames.lastIndexOf("Marek"));
	}

}
