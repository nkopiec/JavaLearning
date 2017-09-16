package pl.java;

public class Bookshop {
	private String title;
	private String publisher;
	private int year;
	private String ident;
	private double price;
	private int qualitity;
	
	public Bookshop(String title, String publisher, int year, String ident, double price, int qualitity) {
		this.title = title;
		this.publisher = publisher;
		this.year = year;
		this.ident = ident;
		this.price = price;
		this.qualitity = qualitity;
	}
	
	public void show() {
		System.out.println(title + " " + publisher + " " + year + " " + ident + " " + price + " " + qualitity);
	}
	
	public void show(String title, String publisher, int year, String ident, double price, int qualitity) {
		System.out.println(title + publisher + year + ident + price + qualitity);
	}
	
	public String getTitle() {
		return this.title;	
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getIdent() {
		return ident;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double p) {
		price = p;
	}
	
	public int gatQualitity() {
		return qualitity;
	}
	
	public void pay(int n) {
		qualitity -= n;
	}
}


