package pl.java;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class CountLines {

	private long  count = 0;
	private PathMatcher matcher;
	private Path startDir;
	
	public CountLines(String startDir) {
		this.startDir = Paths.get(startDir);
	}
	
	public long of(String glob) throws IOException {
		matcher = FileSystems.getDefault().getPathMatcher("glob: " + glob);
		Files.walkFileTree(startDir, new SimpleFileVisitor<Path>() {
			public FileVisitResult visitFile(Path file, BasicFileAttributes a) {
				if (matcher.matches(file.getFileName())) {
					try {
						count += Files.readAllLines(file, Charset.defaultCharset()).size();
					} catch (IOException exc) {
						System.out.println(exc);
					}
				}
				return FileVisitResult.CONTINUE;
			}
		});
		return count;
	}
}
