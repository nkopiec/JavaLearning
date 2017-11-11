package pl.java;

import java.util.ArrayDeque;

public class Queue_ex {
	public static void main(String[] args) {
		ArrayDeque<String> deq = new ArrayDeque<>();
		deq.offer("When is ");
		deq.add("winter");
		deq.add("it's snowing");
		deq.addFirst("Is cold");
		System.out.println(deq + "(FIFO)");
		System.out.println("We peep (of beginning): " + deq.peek());
		
		deq.clear();
		deq.addFirst("When is");
		deq.add("hot");
		deq.add("is ");
		deq.add("summer");
		deq.add("and are");
		deq.add("holiday");
		System.out.println(deq + "(LIFO)");
	}
}
