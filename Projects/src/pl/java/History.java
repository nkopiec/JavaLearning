package pl.java;

import java.io.File;
import java.io.IOException;

public class History {
	private String m = "Math.txt";
	private File file = new File(m);
	
	public String getHistory() throws IOException {
		
		return m;
		
	}
}
