package pl.java;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.*;

public class CopyFileI {
	private static final CopyOption REPLACE_EXISTING = null;
	private static final CopyOption COPY_ATTRIBUTES = null;
	static void copyFile(String srcFn, String destFn, CopyOption ... opt) {
		Path src = Paths.get(srcFn);
		Path dest = Paths.get(destFn);
		
	}
	public static void main(String[] args) throws IOException {
		copyFile("FileI", "File", REPLACE_EXISTING);
		copyFile("FileI", "C:/natalia/FileI", COPY_ATTRIBUTES);
	}
}
