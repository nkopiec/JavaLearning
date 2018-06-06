package pl.java;

public class Main {

	public static void main(String[] args) {
		testForest();
	}
	
	public static void testForest() {
		Tree tree = new Tree();
		ForestGrow<Forestable> forestGrow = new ForestGrow<Forestable>(tree);
		forestGrow.attemptGrow();
		
		Bush bush = new Bush();
		ForestGrow<Forestable> forestGrow1 = new ForestGrow<Forestable>(bush);
		forestGrow1.attemptGrow();
	}

}
