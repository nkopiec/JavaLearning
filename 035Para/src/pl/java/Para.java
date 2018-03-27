package pl.java;

public class Para<S, T> {
	private S first;
	private T last;
	
	public Para(S f, T l) {
		first = f;
		last = l;
		
	}
	
	public S getFirst() { return first; }
	public T getLast() { return last; }
	
	public void setFirst(S f) { first = f; }
	public void setLast(T l) { last = l; }
	
	public String toString() {
		return first + " " + last;
	}
	
	Para<String, String> p1 = new Para<> ("Jan", "Kowalski");
	Para<String, String> p2 = new Para<> ("Siedliska ", "Lubenia");
	Para<String, Integer> p3 = new Para<> ("Bogus³aw", 78);
	
}
