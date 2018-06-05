package pl.java;

public class Main {
	public static void main(String[] args) {
			Forest forest = new Forest();
			Tree tree = new Tree();
			Bush bush = new Bush();
			
			ForestFeature<Forest> forestFeaure = new ForestFeature<Forest>(forest);
			forestFeaure.attemptGrow();
			
			forestFeaure.rustleForest(tree);
			forestFeaure.attemptGrow();
			
			forestFeaure.rustleForest(bush);
			forestFeaure.attemptGrow();
	}
}
