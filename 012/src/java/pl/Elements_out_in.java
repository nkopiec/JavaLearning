package java.pl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Elements_out_in {
		private static final int FileInputStream = 0;
		private static final int FileOutputStream = 0;

		public static void main(String[] args) throws FileNotFoundException {
			FileInputStream in = new FileInputStream("C:/Andrzej/text.java");
			FileOutputStream out = new FileOutputStream("C:\\Andrzej\\text.java");
			System.out.println(FileInputStream + FileOutputStream);
		}
}
