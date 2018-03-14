package pl.java;

public class FigureTest {

	public static void main(String[] args) {
	
		
		Circle circle = new Circle();
		Circle circle1 = new Circle(50);
		Ractangle ractangle = new Ractangle();
		Ractangle ractangle1 = new Ractangle(7, 3, "Red", true);
		Figure figure = new Figure();
		
		
		
		Figure[] figurs = new Figure[5];
		figurs[0] = circle;
		figurs[1] = circle1;
		figurs[2] = ractangle;
		figurs[3] = ractangle1;
		figurs[4] = figure;
		
		for (int i = 0; i < 5 ; i++) {
			System.out.println(figurs[i]);
		}
		
	}

}
