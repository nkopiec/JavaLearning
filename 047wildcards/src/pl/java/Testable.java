package pl.java;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public interface Testable {

	static void show(ArrayList<?> list) {
		for (Object o : list)
			System.out.println(o);
	}
	static void show0() throws IOException {
		List<String> lines = Files.readAllLines(Paths.get("tu"), 
			Charset.defaultCharset());
		for (String s : lines) {
		}	
	}
	static void show1(List<Integer> list) {
		HashMap<String, String> map = null;
		for (String key : map.keySet());
	}

	
}
