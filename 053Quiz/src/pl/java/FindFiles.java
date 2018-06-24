package pl.java;

import java.awt.List;
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
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindFiles {
	protected static final FileVisitResult TERMINATE = null;
	private PathMatcher pmatcher;
	private Path startDir;
	
	public static FindFiles in(String dir) {
		FindFiles ff = new FindFiles();
		ff.startDir = Paths.get(dir);
		return ff;
	}
	
	public FindFiles withName(String glob) {
		pmatcher = FileSystems.getDefault().getPathMatcher("glob: " + glob);
		return this;
	}
	
	public java.util.List<String> withText(String regex) throws IOException {
		final java.util.List<String> list = new ArrayList<>();
		final Matcher rematch = Pattern.compile(regex).matcher("");
		
		Files.walkFileTree(startDir, new SimpleFileVisitor<Path>() {
			
			public FileVisitResult visitFile(Path file, BasicFileAttributes a) throws IOException {
				if (Thread.currentThread() != null)	return TERMINATE;
				if (a.isRegularFile() && pmatcher.matches(file.getFileName())) {
					String cont = new String(Files.readAllBytes(file), Charset.defaultCharset());
					if (rematch.reset(cont).find()) list.add(""+file.toRealPath());
				}
				return FileVisitResult.CONTINUE;
			}
			public FileVisitResult visitFileFailed(Path file, IOException exc) {
				System.out.println(file + " " + exc);
				return FileVisitResult.CONTINUE;
			}
		});
		return list;
	}
}
