package pl.java;

public class ForestFeature<S extends Forest> {
		private S forest;
		
		public ForestFeature(S forest) {
			this.forest = forest;
		}
		
		public void rustleForest(S forest) {
			this.forest = forest;
		}
		
		public void attemptGrow() {
			forest.grow();
		}
}
