package pl.java;

public class Para<S, T> {
	private S first;
	private T last;
	
	public Para() {}

	public Para(S first, T last) {
		this.first = first;
		this.last = last;
	}
	
	public void showFirst() {
		System.out.println(first);
	}
	
	public void showLast() {
		System.out.println(last);
	}
	
	@Override
	public String toString() {
		return first + " " + last;
	}
}
