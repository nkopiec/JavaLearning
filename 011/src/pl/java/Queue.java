package pl.java;

import java.awt.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class Queue {
	private static final int FileInputStream = 0;
	private static final int FileOutputStream = 0;

	public static void main(String[] args) throws FileNotFoundException {
		ArrayDeque<String> deq = new ArrayDeque<>();
		//how queue FIFO
		deq.offer("Ala");
		deq.add("has");
		deq.add("a cat");
		
		System.out.println("FIFO: " + deq);
		System.out.println("We peep (of beginning): " + deq.peek());
		
		//how queue LIFO
		deq.clear();
		deq.addFirst("Ala");
		deq.add("has");
		deq.add("a dog");
		
		System.out.println("LIFO" +deq);
		System.out.println("We peep (of beginning): " + deq.peek());
		
		System.out.println("After queue we can iterate wherewithal iterator");
			for(String s : deq) { System.out.println(s); }
			
		//queue with priorities
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("Dog sleeps, ");
		pq.add("Ala");
		pq.add("has a dog");
		System.out.println("PRIOR QUE: " + pq);
		System.out.println("With queue with priorities we downloade\nnext elements\nalways of beginning");
		System.out.println("Beginning - by default least elements");
		String s;
		while((s = pq.poll()) != null) {
			System.out.println(s);
			
		//FileInputStream in = new FileInputStream("C:/Andrzej/text.java");
		//FileOutputStream out = new FileOutputStream("C:\\Andrzej\\text.java");
		//System.out.println(FileInputStream + FileOutputStream);
		}
	}
}
