package pl.java;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public interface Test {
	static void test() {
	Map<String, Integer> map = new HashMap<>();
	for (char c = 'a'; c <= 'd'; c++) map.put("Leters" + c, (int) c);
	
	Set<String> keys = map.keySet();
	System.out.println(keys);
	
	Collection<Integer> vals = map.values();
	System.out.println(vals);
	
	Set<Map.Entry<String, Integer>> entries = map.entrySet();
	System.out.println(entries);
	
	for (Map.Entry<String, Integer> e : map.entrySet()) {
		Integer val = e.getValue();
		System.out.println(e.getKey() + "  -> " + val);
		e.setValue(val + 1000);
	}
	}
}