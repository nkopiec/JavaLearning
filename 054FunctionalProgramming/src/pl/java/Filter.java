package pl.java;

import java.util.ArrayList;
import java.util.List;

public interface Filter<V> {
	boolean test(V v);

	
	static <T, S> List<T> create(List<S> src, Filter<S> f, Transformer<T, S> t) {
		List<T> target = new ArrayList<>();
		for (S e : src)
			if (f.test(e)) target.add(t.transform(e));
		return target;
		
	}
}
