package pl.java;

import java.time.LocalDate;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FuncSamples {
	public static void show(Object o) {
		System.out.println(o);
	}
	
	public static void main(String[] args) {
		Predicate<String> p = s -> s.length() > 10;
		show (p.test("aaaa"));
		
		Function<Integer, String> f = n -> n.toString();
		show(f.apply(101001).length());
		
		UnaryOperator<String> uo = st -> st + 10;
		show(uo.apply("pies"));
		
		Supplier<LocalDate> su = LocalDate::now;
		show(su.get());
	
		BiPredicate<String, Integer> bp = (str, n) -> str.length() > n;
		show (bp.test("ala", 1));
		
		BiFunction<String, Integer, String> bi = (xs,i) -> xs + i*2;
		show(bi.apply("bear", 101));
		
		BinaryOperator<String> bo = (s1, s2) -> s1 + s2;
		show(bo.apply("bear", "cat"));
		
		
	}
}
