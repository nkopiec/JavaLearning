package pl.java;

public class Figure {
	String color;
	boolean impletion;
	
	public Figure() {
		this("Black", false);
	}
	
	public Figure(String c, boolean i){
		color = c;
		impletion = i;
	}
	public String toString() {
		return "Color" + color + "Impletion" + impletion;
	}

	public static void main(String[] args) {
		

	}

}
