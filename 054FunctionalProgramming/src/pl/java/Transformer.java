package pl.java;

import java.util.Arrays;
import java.util.List;

public interface Transformer<T,S> {
	T transform(S v);
	
	List<Integer> num = Arrays.asList( 1, 3, 5, 10, 9, 12, 7 );
	
}