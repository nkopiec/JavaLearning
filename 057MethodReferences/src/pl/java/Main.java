package pl.java;

import java.awt.print.Book;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		BookCreator<Book> creator = (a, b, c) -> new pl.java.Book();
		 
		 BookCreator<Book> creatorNew = null;
		List<pl.java.Book> list = Arrays.asList(
			      creatorNew.create(39.99, "Czysty kod", "twarda"),
			      creatorNew.create(49.99, "Pani jeziora", "miêkka"),
			      creatorNew.create(19.99, "Hobbit","twarda"));

		 Object book = null;
		list.sort(Comparator.comparing(b -> ((pl.java.Book) book).getPrice()));
		 
		 Function<String, String> consumerReference = String::toUpperCase;
		list.forEach(e -> System.out.println(consumerReference.apply(((pl.java.Book) e).getTitle())));
	}

}
