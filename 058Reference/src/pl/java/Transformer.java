package pl.java;

public interface Transformer<T, S> {
	T transform(S v);
}

interface Operator<R, T, S> {
	R oper(T v1, S v2);
}
