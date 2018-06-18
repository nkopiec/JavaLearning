package java.pl;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class SimpleDemo {
	
//File currentDir = new File("jsoadj").getAbsoluteFile();
	public static void main(String args[]) throws IOException {
		Files.walkFileTree(Paths.get(""), new FileVisitor<Path>() {
			
			public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes a) {
				System.out.println("I'm coming to: " + dir);
				return FileVisitResult.CONTINUE;
			}

			public FileVisitResult visitFile(Path file, BasicFileAttributes a) throws IOException {
				System.out.println(" -> file: " + file);
				return FileVisitResult.CONTINUE;
			}

			public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
				System.out.println("I'm out of: " + dir);
				return FileVisitResult.CONTINUE;
			}

			public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
				System.err.println("unsuccessful inspection files: " + file + " - " + exc);
				return FileVisitResult.CONTINUE;
			}
		});
	}
}