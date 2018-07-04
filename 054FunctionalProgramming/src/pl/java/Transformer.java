package pl.java;

import java.util.Arrays;
import java.util.List;

public interface Transformer<T,S> {
	T transform(S v);
	
	
}