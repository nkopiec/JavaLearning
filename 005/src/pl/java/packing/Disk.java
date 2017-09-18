package pl.java.packing;


public class Disk {
	private static double vat;
	
	private String model;
	private int capacity;
	private double price;
	
	public Disk(String model, int capacity, double price) {
		this.model = model;
		this.capacity = capacity;
		this.price = price;
	}
	
	public Disk(String model, int capacity) {
		this.model = model;
		this.capacity = capacity;
	}
	
	public String getDespription() {
		return model + ", " + capacity + " GB";
	}
	
	public double getBruttoPrice() {
		return price * (1 + vat / 100);
	}

	public static void setVat(double v) {
		vat = v;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void show() {
		System.out.println(vat + ", " + model + ", " + capacity + ", " + price);
	}
}
