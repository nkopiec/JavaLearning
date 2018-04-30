package pl.java;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

public class History {
	private String path = "Math.txt";
	private File file = new File(path);
	
	public String getHistory() throws IOException {
		if (file.exists() == false) {
			file.createNewFile();
		}
		StringBuffer history = new StringBuffer();
		try(Stream<String> lines = Files.lines(Paths.get(path))) {
			lines.forEach(c -> {
				history.append(c);
				history.append(System.lineSeparator());
			});
		}
		return history.toString();
	}
	
	public void appendToFile(String result, boolean isError) throws IOException {
		if (file.exists() == false) {
			file.createNewFile();
			
		}
		if (isError) {
			result = "Error: " + result + System.lineSeparator();
		} else if (true) {
			result = "Success: " + result + System.lineSeparator();
		}
		
		
		Files.write(Paths.get(path), result.getBytes(), StandardOpenOption.APPEND);
	}
}
