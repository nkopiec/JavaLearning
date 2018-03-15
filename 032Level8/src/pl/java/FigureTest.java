package pl.java;

public class FigureTest {

	public static void main(String[] args) {
	
		
		Circle circle = new Circle();
		Circle circle1 = new Circle(50);
		Ractangle ractangle = new Ractangle();
		Ractangle ractangle1 = new Ractangle(7, 3, "Red", true);
		
		
		
		
		Figure[] figurs = new Figure[4];
		figurs[0] = circle;
		figurs[1] = circle1;
		figurs[2] = ractangle;
		figurs[3] = ractangle1;
		
	
		for (int i = 0; i < 4 ; i++) {
			if (figurs[i] instanceof Circle) {
				System.out.println(((Circle)figurs[i]).calculateArea());
			}
			if (figurs[i] instanceof Ractangle) {
				System.out.println(((Ractangle)figurs[i]).calculateArea());
			}
			
	}
		
	}

}
