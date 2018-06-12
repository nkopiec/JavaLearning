package pl.java;

public class Rectangle implements Figure {
	
	public String getName() {
		return "Ractangle";
	}
}

	class Square extends Rectangle {
		
		public String getName() {
			return "Square";
		}
	}
