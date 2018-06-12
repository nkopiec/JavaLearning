package pl.java;

public class Para<T, S> {
	private T first;
	private S second;
	
	public Para(T first, S second) {
		this.first = first;
		this.second = second;
	}
	
	public T getFirst() {
		return first;
	}
	
	public S getSecond() {
		return second;
	}
	Para<BoxOnSteroids<Lemon>, BoxOnSteroids<Peach>> pairOfBoxes1 =
            new Para<>(
                    new BoxOnSteroids<>(new Lemon()),
                    new BoxOnSteroids<>(new Peach())
            );
	Para<BoxOnSteroids<Lemon>, BoxOnSteroids<Peach>> parafBoxes = 
			new Para<>(
					new BoxOnSteroids<>(new Lemon()),
					new BoxOnSteroids<>(new Peach())
					);

}