package pl.java;

public class Toc {
public static void main(String[] args) {
	System.out.println(toc);
}
	private static String doc;
	private static String toc = "";
	
	private final String ls = System.getProperty("line.separator");
	
	public Toc(String doc) {
		this.doc = doc;
		
	}
public String getToc() throws IllegalStateException {
	int p = 0;
	while ((p = doc.indexOf("<h2>", p)) != -1) {
		int end = doc.indexOf("</h2>", p+4);
		if (end == -1) throw new IllegalStateException("Invalid document structure");
		toc += doc.substring(p+4, end) + ls;
		p = end +5;
		}
		return toc;
	}

}