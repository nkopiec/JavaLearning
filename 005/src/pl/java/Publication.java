package pl.java;

public class Publication {
	private String tiitle;
	private String publisher;
	
	public Publication(String tiitle, String publisher) {
		this.tiitle = tiitle;
		this.publisher = publisher;
	}
	
	public void show() {
		System.out.println(tiitle + " " + publisher);
	}
	
	public String getTiitle() {
		return this.tiitle;
	}
}
