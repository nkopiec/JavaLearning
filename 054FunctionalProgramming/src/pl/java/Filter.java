package pl.java;

import java.util.ArrayList;
import java.util.List;

public interface Filter<V> {
	boolean test(V v);
}
