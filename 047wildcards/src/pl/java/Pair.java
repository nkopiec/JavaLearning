package pl.java;

public class Pair<T, S> {
    private T first;
    private S second;

    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
    
    Pair<BoxOnSteroids<Orange>, BoxOnSteroids<Apple>> pairOfBoxes1 =
            new Pair<>(
                    new BoxOnSteroids<>(new Orange()),
                    new BoxOnSteroids<>(new Apple())
            );

	Pair<BoxOnSteroids<Orange>, BoxOnSteroids<Apple>> pairOfBoxes =
	        new Pair<>(
	                new BoxOnSteroids<>(new Orange()),
	                new BoxOnSteroids<>(new Apple())
	        );
}