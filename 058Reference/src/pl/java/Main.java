package pl.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

		static <T, S> List<T> create(List<S> src, Transformer<T, S> t) {
			List<T> target = new ArrayList<>();
			for (S s : src) target.add(t.transform(s));
			return target;
		}
		
		static<R, T, S> List<R> create(List<T> src1, List<S> src2, Operator<R, T, S> o) {
			List<R> res = new ArrayList<>();
			for (int i = 0; i < src1.size(); i++) {
				res.add(o.oper(src1.get(i), src2.set(i, null)));
			}
			return res;
		}
		public static void main(String[] args) {
			List<String> s = Arrays.asList("pies", "kot", "ryba" );
			List<String> sn = Arrays.asList("111", "222");
			
			List out = create(s, String::toUpperCase);
			System.out.println(out);
			
			String text = "pies i kot s¹ w domu, a ryba p³ywa";
			out = create(s, text::indexOf);
			System.out.println(out);
			
			out = create(sn, Integer::parseInt);
			System.out.println(out);
			
			out = create(s, Animal::new);
			System.out.println(out);
			
			List<String> word = Arrays.asList("alabama", "kociokwik");
			List<Integer> pos = Arrays.asList(1, 5);
			
			out = create(word, pos, String::substring);
			System.out.println(out);
			
			
	} 

}
