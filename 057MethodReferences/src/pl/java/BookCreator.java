package pl.java;

@FunctionalInterface
public interface BookCreator<book> {
		Book create(double price, String title, String cover);
}